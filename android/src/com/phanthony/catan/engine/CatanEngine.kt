package com.phanthony.catan.engine


class CatanEngine() {
    companion object {
        val wheat = 1
        val wood = 2
        val brick = 3
        val ore = 4
        val sheep = 5
        val sand = 6
    }

    val resourceList = arrayListOf<Int>().apply {
        for (t in 0 until 4) {
            add(wheat)
            add(wood)
            add(sheep)
            if (t != 3) {
                add(ore)
                add(brick)
            }
        }
        add(sand)
    }
    val numList = arrayListOf<Int>().apply {
        add(2)
        for (t in 0 until 2) {
            for (num in 3 until 12) {
                if (num != 7) {
                    add(num)
                }
            }
        }
        add(12)
    }

    val board = Board(arrayListOf())

    fun createTiles() {
        for (i in 0 until 5) {
            val tilesToCreate = when {
                (i > 2) -> {
                    3 + 4 - i
                }
                else -> {
                    3 + i
                }
            }
            board.tileList.add(arrayListOf())
            for (x in 0 until tilesToCreate) {
                val resource = if (resourceList.size > 1) {
                    resourceList.removeAt((0 until resourceList.size).random())
                } else {
                    resourceList.removeAt(0)
                }
                val number = if (resource == sand) {
                    13
                } else {
                    if (numList.size > 1) {
                        numList.removeAt((0 until numList.size).random())
                    } else {
                        numList.removeAt(0)
                    }
                }
                val mTile = Tile(number, resource, false, arrayListOf())
                board.tileList[i].add(mTile)
            }

        }
    }

    fun testPrint() {
        for (i in (0 until board.tileList.size)) {
            println("Row $i")
            for (x in board.tileList[i]) {
                println(x.toString())
            }
        }
    }
}