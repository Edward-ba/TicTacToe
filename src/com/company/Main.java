package com.company;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.clearBoard();
        board.placePiece(0, 2, 1);
        board.printBoard();
    }
}
