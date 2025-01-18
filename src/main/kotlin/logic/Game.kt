package logic

import model.Player
import enum.Result

class Game(private val playerA: Player, private val playerB: Player, private val rounds: Int) {

    private var playerAWins = 0
    private var playerBWins = 0
    private var draws = 0

    fun play() {
        repeat(rounds) {
            val moveA = playerA.makeMove()
            val moveB = playerB.makeMove()

            when (GameEngine.determineResult(moveA, moveB)) {
                Result.WIN -> playerAWins++
                Result.LOSE -> playerBWins++
                Result.DRAW -> draws++
            }
        }
    }

    fun printResults(){
        println("Player A wins $playerAWins of $rounds games")
        println("Player B wins $playerBWins of $rounds games")
        println("Draws: $draws of $rounds games")
    }

}
