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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    val currentQuestion = ProveedorPreguntas.obtenerPreguntas().random()
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Cyan)) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = viewModel.indicePreguntaActual.toString() + ". " + currentQuestion.pregunta
            )

            Box(
                modifier = Modifier.fillMaxSize()
            ){
                Column() {
                    Row() {
                        Button(onClick = { if (currentQuestion.respuesta1==currentQuestion.respuestaCorrecta) {
                            viewModel.puntuacion++
                        }
                            if (viewModel.indicePreguntaActual==10){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                            else{
                                viewModel.indicePreguntaActual++
                            }

                        } ) { Text(currentQuestion.respuesta1) }
                        Button(onClick = { if (currentQuestion.respuesta2==currentQuestion.respuestaCorrecta)
                        {
                            viewModel.puntuacion++
                        }
                            if (viewModel.indicePreguntaActual==10){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                            else{
                                viewModel.indicePreguntaActual++
                            }
                        } ) { Text(currentQuestion.respuesta2) }
                    }
                    Row() {
                        Button(onClick = { if (currentQuestion.respuesta3==currentQuestion.respuestaCorrecta)
                        {
                            viewModel.puntuacion++
                        }
                            if (viewModel.indicePreguntaActual==10){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                            else{
                                viewModel.indicePreguntaActual++
                            }
                        } ) { Text(currentQuestion.respuesta3) }
                        Button(onClick = { if (currentQuestion.respuesta4==currentQuestion.respuestaCorrecta)
                        {
                            viewModel.puntuacion++
                        }
                            if (viewModel.indicePreguntaActual==10){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                            else{
                                viewModel.indicePreguntaActual++
                            }
                        } ) { Text(currentQuestion.respuesta4) }
                    }
                }
            }
        }

    }
}