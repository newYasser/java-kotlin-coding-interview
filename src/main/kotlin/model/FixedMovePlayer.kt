package model

import enum.Move

class FixedMovePlayer(override val name:String,private val move: Move) : Player {
    override fun makeMove(): Move = move
}
