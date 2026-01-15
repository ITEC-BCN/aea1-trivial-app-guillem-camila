package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object MenuScreen:Routes("Screen_menu")
    object GameScreen:Routes("Screen_game")
    object ResultScreen:Routes("Screen_result")
    object SplashScreen:Routes("Screen_splash")
}