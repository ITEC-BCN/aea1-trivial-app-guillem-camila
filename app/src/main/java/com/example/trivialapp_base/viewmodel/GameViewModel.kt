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
    private var preguntasPartida: List<Pregunta> = emptyList()
    var indicePreguntaActual by mutableIntStateOf(1)

    var preguntaActual by mutableStateOf<Pregunta?>(null)
        private set

    var preguntasMezcladas: List<Pregunta> = emptyList()
        private set

    var puntuacion by mutableIntStateOf(0)

    var tiempoRestante by mutableFloatStateOf(100f)
        private set

    var juegoTerminado by mutableStateOf(false)
        private set

    var dificultadSeleccionada by mutableStateOf("Facil")
        private set
    var extract by mutableStateOf(false)
        private set
    var difficulty by mutableStateOf("")
    private var timer: CountDownTimer? = null
    val tiempoPorPregunta = 10L // 10 segons
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

    private fun cargarSiguientePregunta()
    {
        indicePreguntaActual++
    }



    fun responderPregunta(respuestaUsuario: String) {
    }

    private fun avanzarRonda() {
    }

    private fun iniciarTimer() {
    }

    override fun onCleared() {
    }

}
