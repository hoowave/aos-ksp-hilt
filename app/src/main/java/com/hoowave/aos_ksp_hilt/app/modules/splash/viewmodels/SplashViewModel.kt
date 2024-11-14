package com.hoowave.aos_ksp_hilt.app.modules.splash.viewmodels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.hoowave.aos_ksp_hilt.app.modules.splash.models.SplashModel
import com.hoowave.aos_ksp_hilt.app.router.Routes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val splashModel: SplashModel,
) : ViewModel() {

    init {
        println("SplashViewModel created")
    }

    fun pushHome(navController: NavController) {
        navController.navigate(Routes.Home.route)
    }

}