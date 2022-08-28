package com.example.animeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.animeapp.navigation.SetupNavGraph
import com.example.animeapp.ui.theme.AnimeAppTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeAppTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}