package com.joel.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.joel.data.local.dao.CoinsDao
import com.joel.data.local.entity.CoinEntity

@Database(
    entities = [CoinEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CoinDatabase : RoomDatabase() {

    abstract val coinDao : CoinsDao
}