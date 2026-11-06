package com.example.nexlever

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.nexlever.presentation.navigation.NavController
import com.example.nexlever.presentation.theme.NEXLEVERTheme
import com.example.nexlever.presentation.ui.mainscreen.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            NEXLEVERTheme {

                NavController()

            }
        }
    }
}

