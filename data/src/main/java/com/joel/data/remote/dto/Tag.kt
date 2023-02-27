package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Tag(
    val coin_counter: Int,
    val ico_counter: Int,
    val id: String,
    val name: String
)