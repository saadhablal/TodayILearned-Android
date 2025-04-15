package com.yourdomain.todayilearnedjournal.data

import androidx.room.*

@Dao
interface EntryDao {
    @Query("SELECT * FROM entries ORDER BY date DESC")
    suspend fun getAllEntries(): List<Entry>

    @Query("SELECT * FROM entries WHERE date = :date LIMIT 1")
    suspend fun getEntryByDate(date: String): Entry?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: Entry)

    @Delete
    suspend fun deleteEntry(entry: Entry)
}
