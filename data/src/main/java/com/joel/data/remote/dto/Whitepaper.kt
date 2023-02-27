package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Whitepaper(
    val link: String,
    val thumbnail: String
)