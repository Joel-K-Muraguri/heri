package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Stats(
    val contributors: Int,
    val stars: Int,
    val subscribers: Int
)