package com.XX.LLD.PRACTICE.DesignCricbuzz.Innings;

import com.XX.LLD.PRACTICE.DesignCricbuzz.MatchType.MatchType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class InningDetails {

    Team battingTeam;
    Team bowlingTeam;
    MatchType matchType;
    List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void start(int runsToWin) throws Exception {
//        SET THE BATTING PLAYER
        try {
            battingTeam.chooseNextBatsman();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        int noOfOvers = matchType.noOfOvers();
        for (int overNo = 1; overNo<= noOfOvers; overNo++){
            bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());

            OverDetails overDetails = new OverDetails(overNo, bowlingTeam.getCurrentBowler());
            overs.add(overDetails);
            try {
                boolean won = overDetails.startOver(battingTeam, bowlingTeam, runsToWin);
                if (won) {
                    System.out.println("YOU WON THE GAME");
                    break;
                }
            } catch (Exception e){
                break;
            }

//            SWAP THE STRIKER
//            AS OVER ENDS
            PlayerDetails temp = battingTeam.getStriker();
            battingTeam.setNonStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }
}
