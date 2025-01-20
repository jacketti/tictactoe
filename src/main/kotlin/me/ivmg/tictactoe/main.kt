package me.ivmg.tictactoe

fun TicTacToe(): String {
    var board = board()
    var currentPlayer = "X"
    println("Game Board Creation…\n")
    println(board)
    println("Board Created.\n")
    println("The game will start with player $currentPlayer")
    return "The game will start with player $currentPlayer"
}

public fun board(): String {
    var board = "| |\n" +
            "-+-+-\n" +
            "| |\n" +
            "-+-+-\n" +
            "| |"
    println(board)
    return board
}

