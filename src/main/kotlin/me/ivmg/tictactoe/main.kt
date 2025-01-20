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
var startPlayer = "X"
var currentPlayer = "O"

fun TicTacToe(move: Int): String {
    println("Game Board Creation…\n")
    var board = Board().newBoard()
    println(board)
    println("Board Created.\n")
    println("The game will start with player $startPlayer")

    //make a move
    if (move == 1) {
        return makeAMove(board, move = 1, currentPlayer = startPlayer).toString()
    }
    if (move == 2) {
        makeAMove(board, move = 1, currentPlayer = startPlayer).toString()
        return makeAMove(board, move = 9, currentPlayer = currentPlayer).toString()
    }
    if (move == 5) {
        return makeAMove(board, move = 5, currentPlayer = startPlayer).toString()
    }
    return "The game will start with player $startPlayer"
}

fun makeAMove(board: String, move: Int, currentPlayer: String): String {
    var currentPlayer = currentPlayer
    var board: String = board.toString()

    println("Player $currentPlayer made a move")
    println("Move is $move")
    if (move == 1) {
        position1 = currentPlayer
    } else if (move == 2) {
        position2 = currentPlayer
    } else if (move == 3) {
        position3 = currentPlayer
    } else if (move == 4) {
        position4 = currentPlayer
    } else if (move == 5) {
        position5 = currentPlayer
    } else if (move == 6) {
        position6 = currentPlayer
    } else if (move == 7) {
        position7 = currentPlayer
    } else if (move == 8) {
        position8 = currentPlayer
    } else if (move == 9) {
        position9 = currentPlayer
    }

    board = "$position1|$position2|$position3\n" +
            "-+-+-\n" +
            "$position4|$position5|$position6\n" +
            "-+-+-\n" +
            "$position7|$position8|$position9"
    println(board)
    if (currentPlayer == "X") {
        currentPlayer = "O"
    } else {
        currentPlayer = "X"
    }
    println("Current player is now $currentPlayer")
    return board
}

class Board() {
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
}
