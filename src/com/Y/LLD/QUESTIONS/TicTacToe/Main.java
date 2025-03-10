package com.Y.LLD.QUESTIONS.TicTacToe;

public class Main {
    public static void main(String[] args){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.initilizeGame();
        System.out.println("WINNER OF GAME IS:- " +ticTacToe.startGame());
    }
}
