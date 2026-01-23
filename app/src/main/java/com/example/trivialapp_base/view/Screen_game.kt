package com.example.trivialapp_base.view

import androidx.compose.foundation.background
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.ImageLoader
import coil.compose.AsyncImage
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel
import kotlinx.coroutines.delay
import android.os.Build
import coil.request.ImageRequest
import com.example.trivialapp_base.R
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder


@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
    val currentQuestion = remember(viewModel.indicePreguntaActual) {
        ProveedorPreguntas.obtenerPreguntas().random()
    }
    val context = LocalContext.current
    val imageLoader = rememberGifImageLoader()
    val gifs = listOf(
        R.raw.mesprit,
        R.raw.laprasgigantamax,
        R.raw.mew,
        R.raw.celebi,
        R.raw.aegislash,
        R.raw.blastoisegigantamax,
        R.raw.chandelure,
        R.raw.sylveon,
        R.raw.charizardgigantamaxs,
        R.raw.reuniclus,
        R.raw.cherubi,
        R.raw.dragapult,
        R.raw.dreepy,
        R.raw.pikachugigantamax,
        R.raw.duosions,
        R.raw.dusknoirs,
        R.raw.dwebbles,
        R.raw.eeveegigantamaxs,
        R.raw.ninetalesalolas,
        R.raw.zekroms,
        R.raw.necrozmadawnwingss,
        R.raw.eternatuss,
        R.raw.moltresgalar,
        R.raw.mimikyu,
        R.raw.milotic,
        R.raw.lunala,
        R.raw.leafeon,
        R.raw.kirlia,
        R.raw.jirachi,
        R.raw.haunter,
        R.raw.gengargigantamax,
        R.raw.gardevoir
    )
    var randomGif = remember(viewModel.indicePreguntaActual) { gifs.random() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            TimeCounter()

            AsyncImage(
                model = ImageRequest
                    .Builder(context)
                    .data("android.resource://${context.packageName}/${randomGif}")
                    .build(), contentDescription = "pokemon",
                imageLoader = imageLoader,
                modifier = Modifier
                    .size(300.dp) )
            Text(
                text = viewModel.indicePreguntaActual.toString() + ". " + currentQuestion.pregunta,
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Italic,
                fontSize = 30.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 40.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )

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
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            modifier = Modifier
                                .padding(horizontal = 3.dp, vertical = 0.dp),
                            onClick = { if (currentQuestion.respuesta1==currentQuestion.respuestaCorrecta) {
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
                                fontSize = 17.sp,
                                lineHeight = 40.sp
                            )
                        }
                        Button(
                            modifier = Modifier
                                .padding(horizontal = 3.dp, vertical = 0.dp),
                            onClick = { if (currentQuestion.respuesta2==currentQuestion.respuestaCorrecta)
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
                                fontSize = 17.sp,
                                lineHeight = 40.sp
                        ) }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp) ,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            modifier = Modifier
                                .padding(horizontal = 3.dp, vertical = 0.dp),
                            onClick = { if (currentQuestion.respuesta3==currentQuestion.respuestaCorrecta)
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
                                fontSize = 17.sp,
                                lineHeight = 40.sp
                                ) }

                        Button(
                            modifier = Modifier
                                .padding(horizontal = 3.dp, vertical = 0.dp),
                            onClick = { if (currentQuestion.respuesta4==currentQuestion.respuestaCorrecta)
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
                                fontSize = 17.sp,
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
        fontSize =(30.sp),
        modifier = Modifier
            .padding(20.dp))
}

@Composable
fun rememberGifImageLoader(): ImageLoader {
    val context = LocalContext.current
    return remember {
        ImageLoader.Builder(context)
            .components {
                if (Build.VERSION.SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                } else {
                    add(GifDecoder.Factory())
                }
            }
            .build()
    }
}
