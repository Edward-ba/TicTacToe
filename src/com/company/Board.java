package com.company;

public class Board {
    private char[][] grid = new char[3][3];
    private int height = 3;
    private int width = 3;
    private char playerOnePiece = 'X';
    private char playerTwoPiece = 'O';

    public void clearBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("          x    ");
        System.out.println("      0   1   2");
        System.out.println("      — — — — —");
        for (int i = 0; i < 3; ++i) {
            if (i == 1)
                System.out.print("y " + i + " | ");
            else
                System.out.print("  " + i + " | ");
            for (int j = 0; j < 3; ++j) {
                System.out.print(grid[j][i] + " ");
                if (j < 2) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.print("    | ");
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
        try {
            if (grid[x][y] == playerOnePiece || grid[x][y] == playerTwoPiece)
                return false;
            else if (player == 1) {
                grid[x][y] = playerOnePiece;
                return true;
            } else if (player == 2) {
                grid[x][y] = playerTwoPiece;
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkWinner() {
        int player1NumInARow = 0;
        int player2NumInARow = 0;

        for (int y = 0; y < 3; ++y) {
            player1NumInARow = 0;
            player2NumInARow = 0;
            for (int x = 0; x < 3; ++x) {
                if (grid[x][y] == playerOnePiece) {
                    if (player2NumInARow != 0)
                        x = 3;
                    else {
                        ++player1NumInARow;
                        if (player1NumInARow == 3) {
                            System.out.println("Player One Wins!");
                            return true;
                        }
                    }
                }
                else if (grid[x][y] == playerTwoPiece) {
                    if (player1NumInARow != 0)
                        x = 3;
                    else {
                        ++player2NumInARow;
                        if (player2NumInARow == 3) {
                            System.out.println("Player Two Wins!");
                            return true;
                        }
                    }
                }
                else
                    x = 3;
            }
        }

        player1NumInARow = 0;
        player2NumInARow = 0;

        for (int x = 0; x < 3; ++x) {
            player1NumInARow = 0;
            player2NumInARow = 0;
            for (int y = 0; y < 3; ++y) {
                if (grid[x][y] == playerOnePiece) {
                    if (player2NumInARow != 0)
                        y = 3;
                    else {
                        ++player1NumInARow;
                        if (player1NumInARow == 3) {
                            System.out.println("Player One Wins!");
                            return true;
                        }
                    }
                }
                else if (grid[x][y] == playerTwoPiece) {
                    if (player1NumInARow != 0)
                        y = 3;
                    else {
                        ++player2NumInARow;
                        if (player2NumInARow == 3) {
                            System.out.println("Player Two Wins!");
                            return true;
                        }
                    }
                }
                else
                    y = 3;
            }
        }

        player1NumInARow = 0;
        player2NumInARow = 0;

        for (int i = 0; i < 3; ++i) {
            int x = i;
            int y = i;

            if (grid[x][y] == playerOnePiece) {
                if (player2NumInARow != 0)
                    i = 3;
                else {
                    ++player1NumInARow;
                    if (player1NumInARow == 3) {
                        System.out.println("Player One Wins!");
                        return true;
                    }
                }
            }
            else if (grid[x][y] == playerTwoPiece) {
                if (player1NumInARow != 0)
                    i = 3;
                else {
                    ++player2NumInARow;
                    if (player2NumInARow == 3) {
                        System.out.println("Player Two Wins!");
                        return true;
                    }
                }
            }
            else
                i = 3;
        }

        player1NumInARow = 0;
        player2NumInARow = 0;

        for (int i = 0; i < 3; ++i) {
            int x = 2 - i;
            int y = i;

            if (grid[x][y] == playerOnePiece) {
                if (player2NumInARow != 0)
                    i = 3;
                else {
                    ++player1NumInARow;
                    if (player1NumInARow == 3) {
                        System.out.println("Player One Wins!");
                        return true;
                    }
                }
            }
            else if (grid[x][y] == playerTwoPiece) {
                if (player1NumInARow != 0)
                    i = 3;
                else {
                    ++player2NumInARow;
                    if (player2NumInARow == 3) {
                        System.out.println("Player Two Wins!");
                        return true;
                    }
                }
            }
            else
                i = 3;
        }

        for (int x = 0; x < 3; ++x) {
            for (int y = 0; y < 3; ++y) {
                if (grid[x][y] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("There is a tie");
        return true;
    }
}