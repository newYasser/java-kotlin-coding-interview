import enum.Move
import logic.Game
import model.FixedMovePlayer
import model.RandomPlayer

fun main(args: Array<String>) {

    val playerA = FixedMovePlayer("Player A", Move.ROCK)
    val playerB = RandomPlayer("Player B")

    val game = Game(playerA, playerB,100)
    game.play()
    game.printResults()

}