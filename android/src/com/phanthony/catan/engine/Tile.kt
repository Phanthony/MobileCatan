package com.phanthony.catan.engine

class Tile(val number: Int, val resource: Int, var robber: Boolean, var cornerList: ArrayList<Int>) {
    override fun toString(): String {
        val re = when(resource){
            CatanEngine.sand -> "Sand"
            CatanEngine.brick -> "Brick"
            CatanEngine.ore -> "Ore"
            CatanEngine.sheep -> "Sheep"
            CatanEngine.wood -> "Wood"
            CatanEngine.wheat -> "Wheat"
            else -> "error"
        }
        return ("Tile has number $number, and resource $re")
    }
}