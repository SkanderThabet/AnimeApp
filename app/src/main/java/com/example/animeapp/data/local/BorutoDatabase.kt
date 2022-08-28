package com.example.animeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.animeapp.data.local.dao.HeroDao
import com.example.animeapp.data.local.dao.HeroRemoteKeyDao
import com.example.animeapp.domain.model.Hero
import com.example.animeapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)

abstract class BorutoDatabase : RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDoa(): HeroRemoteKeyDao
}