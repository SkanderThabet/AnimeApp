package com.example.animeapp.domain.service

import androidx.paging.PagingData
import com.example.animeapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHereoes(query: String): Flow<PagingData<Hero>>
}