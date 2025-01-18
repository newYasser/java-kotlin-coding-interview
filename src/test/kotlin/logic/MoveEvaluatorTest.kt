package logic

import enum.Move
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MoveEvaluatorTest {


    @Test
    fun testRockBeatsScissors(){
        val result = MoveEvaluator.beats(Move.ROCK, Move.SCISSORS)
        assertTrue(result)
    }

    @Test
    fun testRockDoesNotBeatPaper(){
        val result = MoveEvaluator.beats(Move.ROCK, Move.PAPER)
        assertFalse(result)
    }

    @Test
    fun testPaperBeatsRock(){
        val result = MoveEvaluator.beats(Move.PAPER, Move.ROCK)
        assertTrue(result)
    }
    @Test
    fun testPaperDoesNotBeatScissors(){
        val result = MoveEvaluator.beats(Move.PAPER, Move.SCISSORS)
        assertFalse(result)
    }

    @Test
    fun testScissorsBeatsPaper(){
        val result = MoveEvaluator.beats(Move.SCISSORS, Move.PAPER)
        assertTrue(result)
    }
    @Test
    fun testScissorsDoesNotBeatRock(){
        val result = MoveEvaluator.beats(Move.SCISSORS, Move.ROCK)
        assertFalse(result)
    }



}