package com.phanthony.catan.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.phanthony.catan.engine.Settlement
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity(tableName = "Corner_Table")
data class CornerTable(@PrimaryKey val cornerId: Int, val playerSettlement: Settlement, val connectedTo: ArrayList<Pair<Int,Int>>)