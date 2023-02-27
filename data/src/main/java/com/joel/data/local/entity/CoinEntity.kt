package com.joel.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.joel.domain.model.Coin

@Entity(tableName = "COIN_TABLE")
data class CoinEntity(
    @PrimaryKey
    val id : String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String,
    val isActive : Boolean
)


fun CoinEntity.toCoin() : Coin{
    return Coin(
        id = id,
        name =  name,
        rank =rank,
        symbol =  symbol,
        type =type,
        isActive = isActive
    )
}