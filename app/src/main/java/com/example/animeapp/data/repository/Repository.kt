package com.example.animeapp.data.repository

import androidx.paging.PagingData
import com.example.animeapp.domain.model.Hero
import com.example.animeapp.domain.service.DataStoreOperations
import com.example.animeapp.domain.service.LocalDataSource
import com.example.animeapp.domain.service.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val local: LocalDataSource,
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {
    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remote.getAllHeroes()
    }

    fun searchHereos(query: String): Flow<PagingData<Hero>> {
        return remote.searchHereoes(query = query)
    }

    suspend fun getSelectedHero(heroId: Int): Hero {
        return local.getSelectedHero(heroId = heroId)
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }
}