package com.XX.LLD.PRACTICE.DesignCricbuzz.Team;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerController.PlayerBattingController;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerController.PlayerBowlingController;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;

import java.util.List;
import java.util.Queue;

public class Team {

    public String teamName;
    public Queue<PlayerDetails> playing11;
    public List<PlayerDetails> bench;
    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;
    public boolean isWinner;

    public Team(String teamName, Queue<PlayerDetails> playing11, List<PlayerDetails> bench, List<PlayerDetails> bowlers) {
        this.teamName = teamName;
        this.playing11 = playing11;
        this.bench = bench;
        battingController = new PlayerBattingController(playing11);
        bowlingController = new PlayerBowlingController(bowlers);
    }

    public String getTeamName() {
        return teamName;
    }

    public void chooseNextBatsman() throws Exception{
        battingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler) throws Exception{
        bowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public PlayerDetails getStriker(){
        return battingController.getStriker();
    }

    public void setStriker(PlayerDetails playerDetails){
        battingController.setStriker(playerDetails);
    }

    public PlayerDetails getNonStriker(){
        return battingController.getNonStriker();
    }

    public void setNonStriker(PlayerDetails playerDetails){
        battingController.setNonStriker(playerDetails);
    }

    public PlayerDetails getCurrentBowler(){
        return bowlingController.getCurrentBowler();
    }

    public int getTotalRuns(){
        int total_runs = 0;
        for(PlayerDetails playerDetails: playing11){
            total_runs+=playerDetails.battingScoreCard.totalRuns;
        }
        return total_runs;
    }

    public void printBattingScoreCard(){
        System.out.println("----------------------------- BATTING SCORECARD ----------------------------------------");
        for(PlayerDetails playerDetails: playing11){
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard(){
        System.out.println("----------------------------- BOWLING SCORECARD ----------------------------------------");
        for(PlayerDetails playerDetails:playing11){
            if(playerDetails.bowlingScoreCard.totalOverCount > 0){
                playerDetails.printBowlingScoreCard();
            }
        }
    }
}
