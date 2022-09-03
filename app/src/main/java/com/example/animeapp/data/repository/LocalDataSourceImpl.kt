package com.example.animeapp.data.repository

import com.example.animeapp.data.local.BorutoDatabase
import com.example.animeapp.domain.model.Hero
import com.example.animeapp.domain.service.LocalDataSource

class LocalDataSourceImpl(
    borutoDatabase: BorutoDatabase
) : LocalDataSource {
    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}