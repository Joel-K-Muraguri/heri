package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Team(
    val id: String,
    val name: String,
    val position: String
)