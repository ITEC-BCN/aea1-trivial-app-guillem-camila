package com.example.trivialapp_base.view

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
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
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel



@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {
    val preguntas = mutableListOf<Pregunta>(            Pregunta("¿Cuántos PP como máximo puede tener Hiperrayo?", "Movimientos", "Facil", "5", "16", "8", "10", "8"),
        Pregunta("¿Cuánta potencia base tiene erupción?", "Movimientos", "Facil", "100", "120", "150", "200", "150"),
        Pregunta("¿Qué pokemon no tiene debilidades en la práctica?", "Tabla de Tipos", "Medio", "Rotom Ventilador", "Zoroark de Hisui", "Eelektross", "Spiritomb", "Eelektross"),
        Pregunta("¿Cuánto aumentan la potencia de los movimientos de su tipo los campos psíquico, eléctrico y de hierba?", "Movimientos", "Medio", "Un 10%", "Un 30%", "Un 50%", "Un 25%", "Un 30%"),
        Pregunta("¿Qué hace el tera estelar?", "Generaciones", "Dificil", "Potencia un movimiento de cada tipo una vez", "Cambia el tipo defensivo", "Hace que teraexplosión siempre haga supereficaz", "Potencia solo los movimientos de tipo estelar", "Potencia un movimiento de cada tipo una vez"),
        Pregunta("¿Qué grupo de pokemon no estaba en espada y escudo?", "Generaciones", "Medio", "Los Regi", "Los Ultraentes", "Arceus y Darkrai", "Los Iniciales de Séptima Generación", "Arceus y Darkrai"),
        Pregunta("¿Qué pokemon de tipo bicho es el único que ha ganado el mundial?", "VGC", "Dificil", "Accelgor", "Volcarona", "Escavalier", "Scizor", "Escavalier"),
        Pregunta("¿Cuál de estos pokemon no tiene la habilidad intimidación?", "Características", "Facil", "Incineroar", "Haxorus", "Luxray", "Mawile", "Haxorus"),
        Pregunta("¿Cuál de estos pokemon no ha ganado ningún torneo oficial de VGC?", "VGC", "Medio", "Clefairy", "Eevee", "Pikachu", "Cottonee", "Pikachu"),
        Pregunta("¿Cuál de estos pokemon no evoluciona?", "Características", "Medio", "Carbink", "Dunsparce", "Poltchageist", "Sinistea", "Carbink"),
        Pregunta("¿Cuál de estos pokemon ha ganado más mundiales en VGC Masters Division?", "VGC", "Medio", "Cresselia", "Kyogre", "Heatran", "Urshifu", "Cresselia"),
        Pregunta("¿De qué tipo es Mega Kangaskhan?", "Tabla de Tipos", "Medio", "Normal", "Lucha", "Normal/Acero", "Normal/Lucha", "Normal")
    )
    Column(modifier = Modifier.fillMaxSize().background(Color.Cyan)) {
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
                viewModel.indicePreguntaActual=1
                viewModel.puntuacion=0
                ProveedorPreguntas.obtenerPreguntas().forEach {
                    ProveedorPreguntas.obtenerPreguntas().remove(it)
                }
                ProveedorPreguntas.obtenerPreguntas().addAll(preguntas)
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

                Button(
                    onClick = { navController.navigate(Routes.GameScreen.route)},
                    modifier = Modifier
                    .padding(50.dp) ) {

                        Text(
                            text = "New Game",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                            )
                }

            }


        }


    }


}