package model

import enum.Move

class RandomPlayer() : Player {
    override fun makeMove(): Move = Move.entries.toTypedArray().random()
}