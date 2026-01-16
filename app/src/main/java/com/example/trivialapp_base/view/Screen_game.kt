package com.example.trivialapp_base.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Cyan)) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Pregunta 1"
            )
            Box(
                modifier = Modifier.fillMaxSize()
            ){
                Column() {
                    Row() {
                        Button(onClick = { viewModel.puntuacion++ } ) { }
                        Button(onClick = { viewModel.puntuacion++ } ) { }
                    }
                    Row() {
                        Button(onClick = {viewModel.puntuacion++ } ) { }
                        Button(onClick = {viewModel.puntuacion++ } ) { }
                    }
                }
            }
        }

    }
}