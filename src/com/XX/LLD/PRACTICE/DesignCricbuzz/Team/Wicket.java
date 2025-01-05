package com.XX.LLD.PRACTICE.DesignCricbuzz.Team;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.BallDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.OverDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;

public class Wicket {

    WicketType wicketType;
    PlayerDetails wicketTakenBy;
    OverDetails overDetails;
    BallDetails ballDetails;

//    CONSTRUCTOR INJECTION
    public Wicket(WicketType wicketType, PlayerDetails wicketTakenBy, OverDetails overDetails, BallDetails ballDetails) {
        this.wicketType = wicketType;
        this.wicketTakenBy = wicketTakenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }

    public PlayerDetails getWicketTakenBy() {
        return wicketTakenBy;
    }

    public void setWicketTakenBy(PlayerDetails wicketTakenBy) {
        this.wicketTakenBy = wicketTakenBy;
    }

    public OverDetails getOverDetails() {
        return overDetails;
    }

    public void setOverDetails(OverDetails overDetails) {
        this.overDetails = overDetails;
    }

    public BallDetails getBallDetails() {
        return ballDetails;
    }

    public void setBallDetails(BallDetails ballDetails) {
        this.ballDetails = ballDetails;
    }
}
