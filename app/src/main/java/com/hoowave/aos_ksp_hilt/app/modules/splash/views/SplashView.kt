package com.hoowave.aos_ksp_hilt.app.modules.splash.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.hoowave.aos_ksp_hilt.app.modules.splash.viewmodels.SplashViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashView(navController: NavHostController) {
    val controller: SplashViewModel = hiltViewModel()

    LaunchedEffect(Unit) {
        delay(2000)
        controller.pushHome(navController)
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Splash View")
    }

}