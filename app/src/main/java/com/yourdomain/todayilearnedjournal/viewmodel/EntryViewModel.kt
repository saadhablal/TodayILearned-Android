package com.yourdomain.todayilearnedjournal.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.yourdomain.todayilearnedjournal.data.AppDatabase
import com.yourdomain.todayilearnedjournal.data.Entry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import net.sqlcipher.database.SQLiteDatabase

class EntryViewModel(application: Application) : AndroidViewModel(application) {
    private val passphrase = SQLiteDatabase.getBytes("your-secure-passphrase".toCharArray())
    private val db = AppDatabase.getDatabase(application, passphrase)
    private val entryDao = db.entryDao()

    private val _entries = MutableStateFlow<List<Entry>>(emptyList())
    val entries: StateFlow<List<Entry>> = _entries

    fun loadEntries() {
        viewModelScope.launch {
            _entries.value = entryDao.getAllEntries()
        }
    }

    fun getEntryForDate(date: String, onLoaded: (Entry?) -> Unit) {
        viewModelScope.launch {
            onLoaded(entryDao.getEntryByDate(date))
        }
    }

    fun saveEntry(entry: Entry) {
        viewModelScope.launch {
            entryDao.insertEntry(entry)
            loadEntries()
        }
    }

    fun deleteEntry(entry: Entry) {
        viewModelScope.launch {
            entryDao.deleteEntry(entry)
            loadEntries()
        }
    }
}
