package logic

import enum.Move

object MoveEvaluator {

    fun beats(move: Move, opponentMove: Move): Boolean{
        return when(move){
            Move.ROCK -> opponentMove == Move.SCISSORS
            Move.PAPER->opponentMove == Move.ROCK
            Move.SCISSORS ->opponentMove == Move.PAPER
        }
    }
}