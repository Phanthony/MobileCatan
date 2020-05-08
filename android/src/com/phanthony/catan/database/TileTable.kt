package com.phanthony.catan.database


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.phanthony.catan.engine.Tile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity(tableName = "Tile_Table")
data class TileTable(@PrimaryKey val tileNumber: Int, var tileList: ArrayList<Tile>)