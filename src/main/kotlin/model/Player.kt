package model

import enum.Move

interface Player {
    val name:String
    fun makeMove(): Move
}