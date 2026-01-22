package com.example.trivialapp_base.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.time.delay

@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    val currentQuestion = ProveedorPreguntas.obtenerPreguntas().random()
    Box(
        modifier = Modifier.fillMaxSize().background(Color.White)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {
            TimeCounter()
            Text(
                text = viewModel.indicePreguntaActual.toString() + ". " + currentQuestion.pregunta,
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Italic,
                fontSize = 40.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 40.sp,
                modifier = Modifier
                    .fillMaxWidth()
            )
            /* Poner imagenes chulas :b
            Image(
                painter = painterResource(id = R.drawable.trivialicontext),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(380.dp)
            )*/
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(30.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = { if (currentQuestion.respuesta1==currentQuestion.respuestaCorrecta) {
                            viewModel.puntuacion++
                        }
                            if (viewModel.indicePreguntaActual==10){
                                navController.navigate(Routes.ResultScreen.route)
                            }
                            else{
                                viewModel.indicePreguntaActual++
                            }

                        } ) {
                            Text(currentQuestion.respuesta1,
                                fontSize = 30.sp,
                                lineHeight = 40.sp
                            )
                        }
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
                        } ) {
                            Text(currentQuestion.respuesta2,
                                fontSize = 30.sp,
                                lineHeight = 40.sp
                        ) }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp) ,
                        horizontalArrangement = Arrangement.Center
                    ) {
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
                        } ) {
                            Text(currentQuestion.respuesta3,
                                fontSize = 30.sp,
                                lineHeight = 40.sp
                                ) }

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
                        } ) {
                            Text(currentQuestion.respuesta4,
                                fontSize = 30.sp,
                                lineHeight = 40.sp
                                ) }
                    }
                }
            }
        }

    }
}
@Composable
fun TimeCounter() {
    var timeLeft by remember { mutableStateOf(10) }
    LaunchedEffect(timeLeft) {
        while (timeLeft > 0) {
            delay(1000L)
            timeLeft -= 1 } }
    Text(
        text = if (timeLeft > 0) "$timeLeft" else "You have no time left",
        color = Color.Black,
        fontSize = 30.sp ) }