package com.example.trivialapp_base.view

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.TextStyle
import com.example.trivialapp_base.ui.theme.Purple40


@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    var expanded: Boolean by remember { mutableStateOf(false) }
    var difficulty: String by remember { mutableStateOf("") }
    viewModel.indicePreguntaActual=1
    viewModel.puntuacion=0
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.White)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text ="PokeTrivial",
                    fontSize = 50.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.trivialicontext),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(380.dp)
                )


                OutlinedTextField(
                    value = difficulty,
                    onValueChange = {difficulty = it},
                    enabled = false,
                    readOnly = true,
                    label = { Text(text = "Difficulty") },
                    textStyle = TextStyle(fontWeight = FontWeight.SemiBold),
                    modifier = Modifier
                        .clickable{expanded = true}
                        .width(260.dp)
                        .height(95.dp)
                        .padding(horizontal = 30.dp, vertical = 10.dp)
                        .border(width = 2.dp, color = Black, shape = RoundedCornerShape(size = 50.dp))
                )
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier
                        .width(300.dp)
                        .padding(5.dp)
                ) {
                    DropdownMenuItem(
                        text = { Text("Easy") },
                        onClick = {
                            difficulty = "Facil"
                            viewModel.setDificultad("Facil")
                        },
                    )
                    DropdownMenuItem(
                        text = { Text("Medium")},
                        onClick = {
                            difficulty = "Medio"
                            viewModel.setDificultad("Medio")}
                    )
                    DropdownMenuItem(
                        text = { Text("Hard")},
                        onClick = {
                            difficulty = "Dificil"
                            viewModel.setDificultad("Dificil")}
                    )
                }

                Button(
                    onClick = {
                        viewModel.iniciarJuego()
                        navController.navigate(Routes.GameScreen.route)
                    },
                    modifier = Modifier.padding(50.dp)
                ) {
                Text(
                    text = "New Game",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                ) }

            }


        }


    }


}