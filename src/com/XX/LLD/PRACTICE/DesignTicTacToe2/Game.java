package com.XX.LLD.PRACTICE.DesignTicTacToe2;

import java.util.Scanner;

public class Game {

    private final Player player1;
    private final Player player2;
    private final Board board;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1;
    }

    public void play() {
//        PRINT THE BOARD
        board.printBoard();

        while (!board.isFull() && !board.hasWinner()) {
            System.out.println("------------------------------------------------------------");
            System.out.println(currentPlayer.getPlayerName() +"'s turn.");

            int row = getValidInput("Enter row(0-2): ");
            int column = getValidInput("Enter column(0-2): ");
            try {
                board.makeMove(row, column, currentPlayer.getSymbol_OX());
                board.printBoard();
                switchPlayer();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        if (board.hasWinner()) {
            switchPlayer();
            System.out.println("---------------------------------\n"+
                    currentPlayer.getPlayerName() +
                    " wins!" +
                    "\n-------------------------------------");
        } else {
            System.out.println("It's a draw.");
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private int getValidInput(String message) {
        Scanner sc = new Scanner(System.in);

        int input;
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= 0 && input <= 2){
                    return input;
                }
            } else {
                sc.next();
            }
            System.out.println("Invalid Input! Please enter a number between 0 and 2.");
        }
    }
}
