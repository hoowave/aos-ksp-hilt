package com.connectsdk.myapplication.repository.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.connectsdk.myapplication.repository.local.entity.CountEntity

@Dao
interface CountDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(countEntity: CountEntity)

    @Query("SELECT * FROM count_table WHERE id = 1")
    suspend fun getCountEntity(): CountEntity?
}