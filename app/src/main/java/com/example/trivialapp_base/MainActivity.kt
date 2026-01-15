package com.example.trivialapp_base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp_base.ui.theme.TrivialAPP_BaseTheme
import com.example.trivialapp_base.view.GameScreen
import com.example.trivialapp_base.view.MenuScreen
import com.example.trivialapp_base.view.ResultScreen
import com.example.trivialapp_base.view.SplashScreen
import com.example.trivialapp_base.viewmodel.GameViewModel
import kotlin.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrivialAPP_BaseTheme {
                // Controlador de navegación
                val myViewModel by viewModels < GameViewModel>()
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.MenuScreen.route
                ) {
                    composable(Routes.MenuScreen.route) { MenuScreen(navigationController, myViewModel) }
                    composable(Routes.GameScreen.route) { GameScreen(navigationController, myViewModel) }
                    composable(Routes.ResultScreen.route) { ResultScreen(navigationController, myViewModel) }
                    composable(Routes.SplashScreen.route) { SplashScreen(navigationController) }
                }


                // Instanciamos el ViewModel una vez



                // Definición de rutas y navegación



            }
        }
    }
}