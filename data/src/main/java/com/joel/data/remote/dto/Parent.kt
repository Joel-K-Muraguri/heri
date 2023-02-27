package com.joel.data.remote.dto

@kotlinx.serialization.Serializable
data class Parent(
    val id: String,
    val name: String,
    val symbol: String
)