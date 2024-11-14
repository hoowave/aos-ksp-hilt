package com.hoowave.aos_ksp_hilt.app.modules.home.viewmodels

import androidx.lifecycle.ViewModel
import com.hoowave.aos_ksp_hilt.app.modules.home.models.HomeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeModel: HomeModel,
) : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> get() = _count

    init {
        println("HomeViewModel created")
    }

    fun increment() {
        _count.value++
    }

}