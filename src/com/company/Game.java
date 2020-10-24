package com.company;
import java.lang.*;
import java.util.*;


public class Game {
    Scanner scanner = new Scanner(System.in);

    int readInt(String message) {
        System.out.print(message);
        int ret;

        try {
            String string = scanner.nextLine();
            ret = Integer.parseInt(string);
            return ret;
        } catch (Exception e) {
            return -1;
        }
    }

    public void Two_player_game() {
        int xCor;
        int yCor;
        Board board = new Board();
        board.clearBoard();
        board.printBoard();
        System.out.println("Player one you are X");
        System.out.println("Player Two you are O");

        while (true) {
            xCor = readInt("Player One please enter your x coordinate:");
            yCor = readInt("Player One please enter your y coordinate:");
            while (!board.placePiece(xCor, yCor, 1)) {
                System.out.println("go again");
                xCor = readInt("Player One please enter your x coordinate:");
                yCor = readInt("Player One please enter your y coordinate:");
            }
            board.printBoard();

            if (board.checkWinner())
                break;

            xCor = readInt("Player Two please enter your x coordinate:");
            yCor = readInt("Player Two please enter your y coordinate:");
            while (!board.placePiece(xCor, yCor, 2)) {
                System.out.println("go again");
                xCor = readInt("Player Two please enter your x coordinate:");
                yCor = readInt("Player Two please enter your y coordinate:");
            }
            board.printBoard();

            if (board.checkWinner())
                break;
        }

    }
}
