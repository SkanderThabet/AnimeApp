package com.example.animeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.animeapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)

abstract class BorutoDatabase : RoomDatabase() {
    abstract fun heroDao()
}