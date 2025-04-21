package com.yourdomain.todayilearnedjournal.ui

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.yourdomain.todayilearnedjournal.data.Entry
import com.yourdomain.todayilearnedjournal.viewmodel.EntryViewModel
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: EntryViewModel) {
    val context = LocalContext.current
    val entries by viewModel.entries.collectAsState()
    val today = LocalDate.now().format(DateTimeFormatter.ISO_DATE)
    var entryText by remember { mutableStateOf(TextFieldValue("")) }
    var loadedForToday by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.loadEntries()
        viewModel.getEntryForDate(today) {
            entryText = TextFieldValue(it?.content ?: "")
            loadedForToday = true
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Today I Learned Journal") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Text("Today's Entry (${today}):", style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = entryText,
                onValueChange = { entryText = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("What did you learn today?") }
            )
            Spacer(Modifier.height(8.dp))
            Button(onClick = {
                viewModel.saveEntry(Entry(today, entryText.text))
                Toast.makeText(context, "Saved!", Toast.LENGTH_SHORT).show()
            }) {
                Text("Save Entry")
            }
            Spacer(Modifier.height(16.dp))
            Text("Previous Entries:", style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(8.dp))
            LazyColumn {
                items(entries.size) { idx ->
                    val entry = entries[idx]
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Column(Modifier.padding(8.dp)) {
                            Text(entry.date, style = MaterialTheme.typography.labelMedium)
                            Spacer(Modifier.height(4.dp))
                            Text(entry.content)
                        }
                    }
                }
            }
        }
    }
}
