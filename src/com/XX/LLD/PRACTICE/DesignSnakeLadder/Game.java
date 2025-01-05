package com.XX.LLD.PRACTICE.DesignSnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;

//        CREATE OR ADD PLAYER
        addPlayer();
    }

    private void addPlayer() {
        Player player1 = new Player("P1", 0);
        Player player2 = new Player("P2", 0);

        players.offer(player1);
        players.offer(player2);
    }

    private Player findPlayerTurn() {
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int checkJump(int playerNewPosition){
        if(playerNewPosition > board.cells.length * board.cells.length-1){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition){
            String jumpBy = (cell.jump.start < cell.jump.end) ?"ladder":"snake";
            System.out.println("---------------------------------------------------------------------------------\n" +
                    "JUMP DONE BY: "+jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

    public void startGame() {
        while (winner == null){
//            CHECK WHOSE TURN
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn is: "+playerTurn.playerID+" current position is: "+playerTurn.getCurrentPosition());

//            roll the DICE
            int diceNumber = dice.rollDice();

//            GET NEW POSITION
            int playerNewPosition = playerTurn.getCurrentPosition() + diceNumber;
            playerNewPosition = checkJump(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;
            System.out.println("Player turn is: "+playerTurn.playerID+" new position is: "+playerNewPosition);
//              CHECK WINNING CONDITION
            if(playerNewPosition >= board.cells.length * board.cells.length-1){
                winner = playerTurn;
            }
        }
        System.out.println("WINNER IS: "+winner.playerID);
    }
}
