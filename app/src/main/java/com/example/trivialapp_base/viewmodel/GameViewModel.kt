package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas

class GameViewModel : ViewModel() {
    var indicePreguntaActual by mutableIntStateOf(1)

    var preguntasMezcladas: List<Pregunta> = emptyList()
        private set
    var puntuacion by mutableIntStateOf(0)

    var dificultadSeleccionada by mutableStateOf("Facil")
        private set

    val gifs = listOf(
        com.example.trivialapp_base.R.raw.mesprit,
        com.example.trivialapp_base.R.raw.laprasgigantamax,
        com.example.trivialapp_base.R.raw.mew,
        com.example.trivialapp_base.R.raw.celebi,
        com.example.trivialapp_base.R.raw.aegislash,
        com.example.trivialapp_base.R.raw.blastoisegigantamax,
        com.example.trivialapp_base.R.raw.chandelure,
        com.example.trivialapp_base.R.raw.sylveon,
        com.example.trivialapp_base.R.raw.charizardgigantamaxs,
        com.example.trivialapp_base.R.raw.reuniclus,
        com.example.trivialapp_base.R.raw.cherubi,
        com.example.trivialapp_base.R.raw.dragapult,
        com.example.trivialapp_base.R.raw.dreepy,
        com.example.trivialapp_base.R.raw.pikachugigantamax,
        com.example.trivialapp_base.R.raw.duosions,
        com.example.trivialapp_base.R.raw.dusknoirs,
        com.example.trivialapp_base.R.raw.dwebbles,
        com.example.trivialapp_base.R.raw.eeveegigantamaxs,
        com.example.trivialapp_base.R.raw.ninetalesalolas,
        com.example.trivialapp_base.R.raw.zekroms,
        com.example.trivialapp_base.R.raw.necrozmadawnwingss,
        com.example.trivialapp_base.R.raw.eternatuss,
        com.example.trivialapp_base.R.raw.moltresgalar,
        com.example.trivialapp_base.R.raw.mimikyu,
        com.example.trivialapp_base.R.raw.milotic,
        com.example.trivialapp_base.R.raw.lunala,
        com.example.trivialapp_base.R.raw.leafeon,
        com.example.trivialapp_base.R.raw.kirlia,
        com.example.trivialapp_base.R.raw.jirachi,
        com.example.trivialapp_base.R.raw.haunter,
        com.example.trivialapp_base.R.raw.gengargigantamax,
        com.example.trivialapp_base.R.raw.gardevoir
    )

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad
    }

    fun iniciarJuego() {
        preguntasMezcladas = ProveedorPreguntas.obtenerPreguntasDiff(dificultadSeleccionada)
        indicePreguntaActual = 1
        puntuacion = 0
    }
    fun obtenerPreguntaActual(): Pregunta{
        return preguntasMezcladas[indicePreguntaActual-1]
    }

    override fun onCleared() {
    }

}
