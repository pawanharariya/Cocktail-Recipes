package com.psh.project.cocktailrecipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.psh.project.cocktailrecipes.ui.detail.DetailScreen
import com.psh.project.cocktailrecipes.ui.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController, startDestination: Screen = Screen.Home) {
    NavHost(navController = navController, startDestination = startDestination.name) {
        composable(route = Screen.Home.name) {
            HomeScreen()
        }

        composable(route = Screen.Detail.name) {
            DetailScreen()
        }
    }
}