package me.ivmg.tictactoe

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainTest {
    @Test fun itShouldReturnABoard() {
        assertEquals("| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |", TicTacToe().toString())
    }
}

