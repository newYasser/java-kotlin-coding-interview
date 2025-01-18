package logic

import enum.Move
import enum.Result
object GameEngine {
    fun determineResult(playerMove: Move, opponentMove: Move): Result{
        return when {
            playerMove == opponentMove -> Result.DRAW
            MoveEvaluator.beats(playerMove, opponentMove) -> Result.WIN
            else -> Result.LOSE
        }
    }
}