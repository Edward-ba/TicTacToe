package com.company;

public class Board {
    char[][] grid = new char[3][3];
    char playerOnePiece = 'X';
    char playerTwoPiece = 'O';
    
    public void clearBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("    0   1   2");
        System.out.println("  — — — — — —");
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; ++j) {
                System.out.print(grid[j][i] + " ");
                if (j < 2) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.print("  | ");
                for (int j = 0; j < 3; ++j) {
                    System.out.print("— ");
                    if (j < 2) {
                        System.out.print("+ ");
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean placePiece(int x, int y, int player) {
        if (grid[x][y] == 'X' || grid[x][y] == 'O') {
            return false;
        }
        else if (player == 1) {
            grid[x][y] = 'X';
            return true;
        }
        else if (player == 2){
            grid[x][y] = 'O';
            return true;
        }
        return false;
    }


}
