package com.connectsdk.myapplication.repository.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.connectsdk.myapplication.repository.local.dao.CountDao
import com.connectsdk.myapplication.repository.local.entity.CountEntity

@Database(entities = [CountEntity::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    abstract fun countDao(): CountDao
}