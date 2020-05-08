package com.phanthony.catan.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Observable

interface TileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTile(tileTable: TileTable)

    @Query("SELECT * FROM Tile_Table WHERE tileNumber LIKE :num")
    fun getTiles(num: Int): Observable<TileTable>

    @Query("DELETE FROM Tile_Table")
    fun deleteAllTiles()

}