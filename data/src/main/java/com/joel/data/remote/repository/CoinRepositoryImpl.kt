package com.joel.data.remote.repository

import com.joel.common.util.ResourceResult
import com.joel.data.network.api.CoinApi
import com.joel.domain.model.Coin
import com.joel.domain.model.CoinDetail
import com.joel.domain.repos.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinApi
) : CoinRepository {
    override suspend fun getCoins(): Flow<ResourceResult<List<Coin>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCoin(): Flow<ResourceResult<CoinDetail>> {
        TODO("Not yet implemented")
    }
}