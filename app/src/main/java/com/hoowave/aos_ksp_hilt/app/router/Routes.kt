package com.hoowave.aos_ksp_hilt.app.router

sealed class Routes(val route: String) {
    data object Splash: Routes(route = "splash")
    data object Home: Routes(route = "home")
}