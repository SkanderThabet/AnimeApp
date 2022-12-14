package com.example.animeapp.di

import android.content.Context
import androidx.room.Room
import com.example.animeapp.data.local.BorutoDatabase
import com.example.animeapp.data.repository.LocalDataSourceImpl
import com.example.animeapp.domain.service.LocalDataSource
import com.example.animeapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDatabase {
        return Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            Constants.BORUTO_DATABASE
        ).build()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(borutoDatabase: BorutoDatabase): LocalDataSource {
        return LocalDataSourceImpl(borutoDatabase = borutoDatabase)
    }
}