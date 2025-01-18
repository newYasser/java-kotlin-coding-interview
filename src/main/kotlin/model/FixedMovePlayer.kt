package model

import enum.Move

class FixedMovePlayer(private val move: Move) : Player {
    override fun makeMove(): Move = move
}
