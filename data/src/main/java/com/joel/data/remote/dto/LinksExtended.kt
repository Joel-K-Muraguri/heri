package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class LinksExtended(
    val stats: Stats,
    val type: String,
    val url: String
)