package com.example.trivialapp_base.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Text(
            viewModel.puntuacion.toString()+"/10")
        Button(
            onClick = { navController.navigate(Routes.MenuScreen.route)},){

        }
    }

}