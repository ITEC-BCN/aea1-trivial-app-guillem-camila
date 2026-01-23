package com.example.trivialapp_base.view

import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel

@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Text(
                text = viewModel.puntuacion.toString()+"/10",
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
            Image(
                painter = if (viewModel.puntuacion < 5) {
                    painterResource(id = R.drawable.gengar)
                } else if (viewModel.puntuacion in 5..8) {
                    painterResource(id = R.drawable.lapras)
                } else {
                    painterResource((R.drawable.piplup))
                },
                contentDescription = "Logo",
                modifier = Modifier
                    .size(380.dp)
                    .padding(20.dp)
            )
            Button(
                onClick = {
                    navController.navigate(Routes.MenuScreen.route)},){
                Text(
                    text = "Menu",
                    fontSize = 30.sp
                )
            }
            Button(
                onClick = {
                    navController.navigate(Routes.MenuScreen.route)
                }
            ) {
                Text(
                    text = "Share",
                    fontSize = 30.sp
                )
            }
        }



    }

}