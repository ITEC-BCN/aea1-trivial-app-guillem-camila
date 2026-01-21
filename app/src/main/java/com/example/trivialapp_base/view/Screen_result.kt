package com.example.trivialapp_base.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    Text(viewModel.puntuacion.toString()+"/10")
}