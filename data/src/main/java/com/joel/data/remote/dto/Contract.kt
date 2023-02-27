package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Contract(
    val contract: String,
    val platform: String,
    val type: String
)