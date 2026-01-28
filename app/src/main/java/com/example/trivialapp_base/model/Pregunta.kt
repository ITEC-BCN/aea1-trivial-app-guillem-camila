package com.example.trivialapp_base.model

import androidx.lifecycle.viewmodel.compose.viewModel

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
            //Fácil
            Pregunta("¿Cuántos PP como máximo puede tener Hiperrayo?", "Movimientos", "Facil", "5", "16", "8", "10", "8"),
            Pregunta("¿Cuánta potencia base tiene erupción?", "Movimientos", "Facil", "100", "120", "150", "200", "150"),
            Pregunta("¿Cuál de estos pokemon no tiene la habilidad intimidación?", "Características", "Facil", "Incineroar", "Haxorus", "Luxray", "Mawile", "Haxorus"),
            Pregunta("¿Cuántos tipos Pokémon existen actualmente?", "Tabla de Tipos", "Facil", "16", "17", "18", "19", "18"),
            Pregunta("¿Qué tipo es supereficaz contra el tipo Dragón?", "Tabla de Tipos", "Facil", "Roca", "Fantasma", "Dragón", "Acero", "Dragón"),
            Pregunta("¿Cuál es el tipo principal de Gengar?", "Tabla de Tipos", "Facil", "Veneno", "Fantasma", "Psíquico", "Siniestro", "Fantasma"),
            Pregunta("¿Qué objeto cura 20 PS?", "Objetos", "Facil", "Poción", "Antídoto", "Revivir", "Carameloraro", "Poción"),
            Pregunta("¿Qué Pokémon es el nº 25 de la Pokédex?", "Pokédex", "Facil", "Pikachu", "Raichu", "Eevee", "Clefairy", "Pikachu"),
            Pregunta("¿Qué tipo es inmune al tipo Eléctrico?", "Tabla de Tipos", "Facil", "Roca", "Tierra", "Acero", "Dragón", "Tierra"),
            Pregunta("¿Qué movimiento suele golpear primero?", "Movimientos", "Facil", "Ataque Rápido", "Placaje", "Golpe Cabeza", "Onda Trueno", "Ataque Rápido"),
            //Medio
            Pregunta("¿Qué pokemon no tiene debilidades en la práctica?", "Tabla de Tipos", "Medio", "Rotom Ventilador", "Zoroark de Hisui", "Eelektross", "Spiritomb", "Eelektross"),
            Pregunta("¿Cuánto aumentan la potencia de los movimientos de su tipo los campos psíquico, eléctrico y de hierba?", "Movimientos", "Medio", "Un 10%", "Un 30%", "Un 50%", "Un 25%", "Un 30%"),
            Pregunta("¿Qué grupo de pokemon no estaba en espada y escudo?", "Generaciones", "Medio", "Los Regi", "Los Ultraentes", "Arceus y Darkrai", "Los Iniciales de Séptima Generación", "Arceus y Darkrai"),
            Pregunta("¿Cuál de estos pokemon no ha ganado ningún torneo oficial de VGC?", "VGC", "Medio", "Clefairy", "Eevee", "Pikachu", "Cottonee", "Pikachu"),
            Pregunta("¿Cuál de estos pokemon no evoluciona?", "Características", "Medio", "Carbink", "Dunsparce", "Poltchageist", "Sinistea", "Carbink"),
            Pregunta("¿Cuál de estos pokemon ha ganado más mundiales en VGC Masters Division?", "VGC", "Medio", "Cresselia", "Kyogre", "Heatran", "Urshifu", "Cresselia"),
            Pregunta("¿De qué tipo es Mega Kangaskhan?", "Tabla de Tipos", "Medio", "Normal", "Lucha", "Normal/Acero", "Normal/Lucha", "Normal"),
            Pregunta("¿Qué tipo resiste el tipo Fantasma?", "Tabla de Tipos", "Medio", "Siniestro", "Normal", "Hada", "Psíquico", "Siniestro"),
            Pregunta("¿Cuántos turnos dura Pantalla Luz?", "Movimientos", "Medio", "3", "5", "8", "10", "5"),
            Pregunta("¿Qué Pokémon legendario controla el tiempo?", "Legendarios", "Medio", "Dialga", "Palkia", "Giratina", "Arceus", "Dialga"),
            //Difícil
            Pregunta("¿Qué hace el tera estelar?", "Generaciones", "Dificil", "Potencia un movimiento de cada tipo una vez", "Cambia el tipo defensivo", "Hace que teraexplosión siempre haga supereficaz", "Potencia solo los movimientos de tipo estelar", "Potencia un movimiento de cada tipo una vez"),
            Pregunta("¿Qué pokemon de tipo bicho es el único que ha ganado el mundial?", "VGC", "Dificil", "Accelgor", "Volcarona", "Escavalier", "Scizor", "Escavalier"),
            Pregunta("¿Qué habilidad ignora los cambios de estadísticas del rival?", "Habilidades", "Dificil", "Allanamiento", "Inconsciente", "Compensación", "Ignorante", "Ignorante"),
            Pregunta("¿Qué movimiento tiene prioridad +3?", "Movimientos", "Dificil", "Protección", "Finta", "Pico cañón", "Sorpresa", "Sorpresa"),
            Pregunta("¿Qué Pokémon no recibe un 50% de la vida como daño de trampa rocas?", "Competitivo", "Dificil", "Volcarona", "Talonflame", "Charizard", "Minior", "Minior"),
            Pregunta("¿Qué objeto reduce el daño de ataques supereficaces?", "Objetos", "Dificil", "Baya Zidra", "Baya Chiri", "Chaleco Asalto", "Baya Caoca", "Baya Caoca"),
            Pregunta("¿Qué clima potencia la defensa especial de los pokemon de tipo Roca?", "Clima", "Dificil", "Tormenta Arena", "Granizo", "Sol", "Lluvia", "Tormenta Arena"),
            Pregunta("¿Qué Pokémon aprende Danza Dragón por nivel?", "Movimientos", "Dificil", "Gyarados", "Salamence", "Drampa", "Dudunsparce", "Gyarados"),
            Pregunta("¿Qué equipo se volvió popular en VGC 2017?", "VGC", "Dificil", "Big 6", "Fake PG", "Arubega Miraidon", "Weezing-Gigas", "Fake PG"),
            Pregunta("¿Qué objeto bloquea los efectos de estado?", "Objetos", "Dificil", "Banda Focus", "Gafas Elegidas", "Hierba Mental", "Baya Ziuela", "Baya Ziuela"),

            )
    }
    fun obtenerPreguntasDiff(dificultad: String): MutableList<Pregunta> {
        val preguntas = mutableListOf<Pregunta>()
        obtenerPreguntas().forEach {
            if (it.dificultad == dificultad){
                preguntas.add(it)
            }
        }

        return preguntas.shuffled().toMutableList()
    }
}