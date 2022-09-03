package com.example.animeapp.presentation.screens.search

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.animeapp.presentation.common.ListContent
import com.example.animeapp.ui.theme.statusBar
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SearchScreen(
    navController: NavHostController,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val searchQuery by searchViewModel.searchQuery
    val heroes = searchViewModel.searchedHeroes.collectAsLazyPagingItems()
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = MaterialTheme.colors.statusBar
    )
    Scaffold(
        topBar = {
            SearchTopBar(
                text = searchQuery,
                onTextChange = { searchViewModel.updateSearchQuery(query = it) },
                onSearchClicked = {
                    searchViewModel.searchHeroes(query = it)
                },
                onCloseClicked = {
                    navController.popBackStack()
                }
            )
        },
        content = { ListContent(heroes = heroes, navController = navController) }
    )
}