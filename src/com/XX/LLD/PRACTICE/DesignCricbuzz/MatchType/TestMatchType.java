package com.XX.LLD.PRACTICE.DesignCricbuzz.MatchType;

public class TestMatchType implements MatchType{
    @Override
    public int noOfOvers() {
        return 90;
    }

    @Override
    public int maxOverCountBowlers() {
        return Integer.MAX_VALUE;
    }
}
