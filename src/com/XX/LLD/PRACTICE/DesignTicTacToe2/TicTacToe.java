package com.XX.LLD.PRACTICE.DesignTicTacToe2;

public class TicTacToe {

    public static void run(){
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", '0');

        Game game = new Game(player1, player2);
        game.play();
    }
}
