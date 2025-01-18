package model

import enum.Move

class RandomPlayer(override val name:String) : Player {
    override fun makeMove(): Move = Move.entries.toTypedArray().random()
}