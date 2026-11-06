package com.example.nexlever.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nexlever.presentation.ui.mainscreen.MainScreen

@Composable
fun NavController() {

    val controller = rememberNavController()

    NavHost(
        navController = controller,
        startDestination = Route.MainScreen
    )
    {


        composable<Route.MainScreen>{


            MainScreen(controller)


        }

    }


}