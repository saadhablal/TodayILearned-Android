package com.yourdomain.todayilearnedjournal.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entries")
data class Entry(
    @PrimaryKey val date: String, // yyyy-MM-dd
    val content: String
)
