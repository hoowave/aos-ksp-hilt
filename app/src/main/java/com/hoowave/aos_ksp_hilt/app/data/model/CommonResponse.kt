package com.hoowave.aos_ksp_hilt.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CommonResponse<T>(
    val result: String,
    val data: T? = null,
    val message: String? = null
)