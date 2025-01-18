package model

import enum.Move

interface Player {
    fun makeMove(): Move
}