package com.example.animeapp.presentation.screens.home

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.animeapp.navigation.Screens
import com.example.animeapp.presentation.common.ListContent
import com.example.animeapp.ui.theme.statusBar
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = MaterialTheme.colors.statusBar
    )

    Scaffold(
        topBar = {
            HomeTopBar(
                onSearchClicked = {
                    navController.navigate(Screens.Search.route)
                })
        },
        content = {
            ListContent(
                heroes = allHeroes,
                navController = navController
            )
        }
    )
}