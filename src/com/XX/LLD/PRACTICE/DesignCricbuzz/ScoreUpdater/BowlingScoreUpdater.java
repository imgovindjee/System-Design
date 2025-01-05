package com.XX.LLD.PRACTICE.DesignCricbuzz.ScoreUpdater;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.BallDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.BallType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.RunType;

public class BowlingScoreUpdater implements ScoreUpdaterObserver{
    @Override
    public void update(BallDetails ballDetails) {
        if(ballDetails.ballNumber == 6 && ballDetails.ballType == BallType.NORMAL){
            ballDetails.bowledBy.bowlingScoreCard.totalOverCount++;
        }

        if(RunType.ONE == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 1;
        } else if(RunType.TWO == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 2;
        } else if(RunType.THREE == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 3;
        } else if(RunType.FOUR == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 4;
        } else if(RunType.FIVE == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 5;
        } else if (RunType.SIX == ballDetails.runType){
            ballDetails.bowledBy.bowlingScoreCard.runGiven += 6;
        }

        if(ballDetails.wicket != null){
            ballDetails.bowledBy.bowlingScoreCard.wicketTaken++;
        }
        if(ballDetails.ballType == BallType.NO_BALL) {
            ballDetails.bowledBy.bowlingScoreCard.noBallCount++;
        }
        if(ballDetails.ballType == BallType.WIDE_BALL) {
            ballDetails.bowledBy.bowlingScoreCard.wideBallCount++;
        }
        if(ballDetails.ballType == BallType.DEAD_BALL) {
            ballDetails.bowledBy.bowlingScoreCard.extraCount++;
        }
    }
}
