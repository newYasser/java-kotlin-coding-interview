package logic

import enum.Move
import enum.Result
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GameEngineTest {

    private val gameEngine = GameEngine
    @Test
    fun testWinCases(){
        assertEquals(Result.WIN, gameEngine.determineResult(Move.PAPER,Move.ROCK))
        assertEquals(Result.WIN, gameEngine.determineResult(Move.ROCK,Move.SCISSORS))
        assertEquals(Result.WIN, gameEngine.determineResult(Move.SCISSORS,Move.PAPER))
    }

    @Test
    fun testLoseCases(){
        assertEquals(Result.LOSE, gameEngine.determineResult(Move.PAPER,Move.SCISSORS))
        assertEquals(Result.LOSE, gameEngine.determineResult(Move.ROCK,Move.PAPER))
        assertEquals(Result.LOSE, gameEngine.determineResult(Move.SCISSORS,Move.ROCK))
    }
    @Test
    fun testDrawCases(){
        assertEquals(Result.DRAW, gameEngine.determineResult(Move.PAPER,Move.PAPER))
        assertEquals(Result.DRAW, gameEngine.determineResult(Move.ROCK,Move.ROCK))
        assertEquals(Result.DRAW, gameEngine.determineResult(Move.SCISSORS,Move.SCISSORS))
    }
}