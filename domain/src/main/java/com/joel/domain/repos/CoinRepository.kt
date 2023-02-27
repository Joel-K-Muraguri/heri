package com.joel.domain.repos

import com.joel.common.util.ResourceResult
import com.joel.domain.model.Coin
import com.joel.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins() : Flow<ResourceResult<List<Coin>>>

    suspend fun getCoin() : Flow<ResourceResult<CoinDetail>>

}