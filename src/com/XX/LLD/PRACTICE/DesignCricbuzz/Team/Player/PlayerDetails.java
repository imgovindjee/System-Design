package com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.ScoreCard.BattingScoreCard;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.ScoreCard.BowlingScoreCard;

public class PlayerDetails {

    public Person person;
    public PlayerType playerType;
    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

//    METHODS
    public void printBattingScoreCard(){
        System.out.println("PlayerName: "+person.name+" Total Runs: "+battingScoreCard.totalRuns+
                " Total Balls Played: "+battingScoreCard.totalBallsPlayed+" 4's: "+battingScoreCard.totalFours+
                " 6's: "+battingScoreCard.totalSix+ " OutBy: "+(
                        (battingScoreCard.wicketDetails != null)? battingScoreCard.wicketDetails.getWicketTakenBy().person.name:"Not Out"));
    }

    public void printBowlingScoreCard(){
        System.out.println("PlayerName: "+person.name+" Total Over Thrown: "+bowlingScoreCard.totalOverCount+
                " Total Run Given: " +bowlingScoreCard.runGiven+" WicketTaken: "+bowlingScoreCard.wicketTaken);
    }
}
