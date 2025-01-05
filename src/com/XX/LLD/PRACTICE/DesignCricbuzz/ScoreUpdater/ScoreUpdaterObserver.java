package com.XX.LLD.PRACTICE.DesignCricbuzz.ScoreUpdater;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
