package com.hoowave.aos_ksp_hilt.app.router

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hoowave.aos_ksp_hilt.app.modules.home.views.HomeView
import com.hoowave.aos_ksp_hilt.app.modules.splash.views.SplashView

@Composable
fun Router() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Splash.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        composable(route = Routes.Splash.route) {
            SplashView(navController = navController)
        }
        composable(route = Routes.Home.route) {
            HomeView(navController = navController)
        }
    }
}