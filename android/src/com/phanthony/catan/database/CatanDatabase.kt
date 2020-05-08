package com.phanthony.catan.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TileTable::class,CornerTable::class],version = 1)
abstract class CatanDatabase : RoomDatabase() {

    abstract fun getCornerDao(): CornerDao

    abstract fun getTileDao(): TileDao

    companion object{
        private var instance: CatanDatabase? = null

        @Synchronized
        fun getInstance(context: Context): CatanDatabase? {
            synchronized(this){
                if(instance==null){
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            CatanDatabase::class.java,
                            "Catan_Database"
                    ).build()
                }
            }
            return instance
        }
    }
}