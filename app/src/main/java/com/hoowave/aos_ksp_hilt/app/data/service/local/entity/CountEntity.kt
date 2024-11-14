package com.connectsdk.myapplication.repository.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "count_table")
data class CountEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val count: Int
)