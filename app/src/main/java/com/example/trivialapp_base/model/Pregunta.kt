package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            Pregunta("¿Cuántos PP como máximo puede tener Hiperrayo?", "Movimientos", "Facil", "5", "16", "8", "10", "8"),
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
    }
}