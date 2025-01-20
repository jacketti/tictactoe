package me.ivmg.tictactoe

import org.junit.Test
import kotlin.test.assertEquals

class MainTest {
    @Test fun itShouldReturnABoard() {
        assertEquals("| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |", newBoard().toString())
    }

    @Test fun playerXCanWinWithAVerticalLine() {
        // to big at this point
    }

    @Test fun theGameShouldStartWithPlayerX() {
        assertEquals("The game will start with player X", TicTacToe(0).toString())
    }

    @Test fun playerXcanMakeAMove() {
        assertEquals("X| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |", TicTacToe(1).toString())
    }
}

