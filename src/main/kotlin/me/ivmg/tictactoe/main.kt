package me.ivmg.tictactoe

fun TicTacToe(move: Int): String {
    println("Game Board Creation…\n")
    var board = newBoard()
    var currentPlayer = "X"
    println(board)
    println("Board Created.\n")
    println("The game will start with player $currentPlayer")

    //make a move
    if (move == 1) {
        println("Player $currentPlayer made a move")
        board = "X| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |"
        println(board)
        currentPlayer = "O"
        println("Current player is now $currentPlayer")
        return board
    }
    if (move == 2) {
        println("Player $currentPlayer made a move")
        board = "X| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |"
        println(board)
        currentPlayer = "O"
        println("Current player is now $currentPlayer")

        println("Player $currentPlayer made a move")
        board = "X| |\n" +
                "-+-+-\n" +
                "| |\n" +
                "-+-+-\n" +
                "| |O"
        println(board)
        currentPlayer = "X"
        return board
    }
    return "The game will start with player $currentPlayer"
}

fun newBoard(): String {
    var board = "| |\n" +
            "-+-+-\n" +
            "| |\n" +
            "-+-+-\n" +
            "| |"
    return board
}

