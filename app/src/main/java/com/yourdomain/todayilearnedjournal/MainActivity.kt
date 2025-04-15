package com.yourdomain.todayilearnedjournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yourdomain.todayilearnedjournal.ui.MainScreen
import com.yourdomain.todayilearnedjournal.viewmodel.EntryViewModel
import com.yourdomain.todayilearnedjournal.ui.theme.TodayILearnedJournalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodayILearnedJournalTheme {
                val viewModel: EntryViewModel = viewModel()
                MainScreen(viewModel)
            }
        }
    }
}
