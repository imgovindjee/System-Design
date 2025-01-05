package com.XX.LLD.PRACTICE.DesignCricbuzz.Innings;

import com.XX.LLD.PRACTICE.DesignCricbuzz.ScoreUpdater.ScoreUpdaterObserver;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Team;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Wicket;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.WicketType;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {

    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails playedBy;
    public PlayerDetails bowledBy;
    public Wicket wicket;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList = new ArrayList<>();

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void startBallDelivery(Team battingTeam, Team bowlingTeam, OverDetails over){
        playedBy = battingTeam.getStriker();
        this.bowledBy = over.bowledBy;
        ballType = BallType.NORMAL;

        if(isWicketTaken()){
            runType = RunType.ONE;

//            CONSIDERING ONLY ---------BOLD-----------
            wicket = new Wicket(WicketType.BOLD, bowlingTeam.getCurrentBowler(), over, this);
//            making only
//            STRIKER OUT FOR NOW
            battingTeam.setStriker(null);
        } else {
            runType = getRunType();
            if(runType == RunType.ONE || runType == RunType.THREE){
//                SWAP THE STRIKER
                PlayerDetails lastBallStriker = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(lastBallStriker);
            }
        }

//        UPDATE THE PLAYER
//        SCOREBOARD
        notifyUpdaters(this);
    }

    private boolean isWicketTaken(){
        return Math.random() < 0.2;
    }

    private RunType getRunType(){
        double value = Math.random();
        if(value <= 0.2){
            return RunType.ONE;
        } else if(value >= 0.3 && value < 0.5) {
            return RunType.TWO;
        } else if(value == 0.5){
            return RunType.THREE;
        } else if(value >= 0.6 && value <= 0.8){
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

    private void notifyUpdaters(BallDetails ballDetails){
        for(ScoreUpdaterObserver scoreUpdaterObserver:scoreUpdaterObserverList){
            scoreUpdaterObserver.update(ballDetails);
        }
    }
}
