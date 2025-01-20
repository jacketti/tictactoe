package me.ivmg.tictactoe
var position1 = " "
var position2 = " "
var position3 = " "
var position4 = " "
var position5 = " "
var position6 = " "
var position7 = " "
var position8 = " "
var position9 = " "

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
    if (move == 5) {
        println("Player $currentPlayer made a move")
        position5 = currentPlayer
        board = "$position1|$position2|$position3\n" +
                "-+-+-\n" +
                "$position4|$position5|$position6\n" +
                "-+-+-\n" +
                "$position7|$position8|$position9"
        println(board)
        currentPlayer = "O"
        println("Current player is now $currentPlayer")
        return board
    }
    return "The game will start with player $currentPlayer"
}

fun newBoard(): String {
    position1 = " "
    position2 = " "
    position3 = " "
    position4 = " "
    position5 = " "
    position6 = " "
    position7 = " "
    position8 = " "
    position9 = " "

    var board = "$position1|$position2|$position3\n" +
            "-+-+-\n" +
            "$position4|$position5|$position6\n" +
            "-+-+-\n" +
            "$position7|$position8|$position9"
    return board
}

