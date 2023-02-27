package com.joel.data.remote.dto

import com.joel.data.local.entity.CoinEntity
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class CoinDTO(
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDTO.toCoin() : CoinEntity{
    return CoinEntity(
        id =id,
        name = name,
        rank =  rank,
        symbol =  symbol,
        type = type,
        isActive = isActive
    )
}