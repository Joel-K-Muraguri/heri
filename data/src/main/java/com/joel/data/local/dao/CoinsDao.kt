package com.joel.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.joel.data.local.entity.CoinEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CoinsDao {

    @Query("SELECT * FROM COIN_TABLE")
    fun getAllCoins() : Flow<List<CoinEntity>>

    @Upsert
    fun upsert(coins : List<CoinEntity>)

}