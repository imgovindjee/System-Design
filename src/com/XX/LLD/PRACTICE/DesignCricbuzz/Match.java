package com.XX.LLD.PRACTICE.DesignCricbuzz;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Innings.InningDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.MatchType.MatchType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Team;

import java.util.Date;

public class Match {

    Team teamA;
    Team teamB;
    Date matchDate;
    String venue;
    Team tossWinner;
    InningDetails[] innings;
    MatchType matchType;

    public Match(Team teamA, Team teamB, Date matchDate, String venue, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.venue = venue;
        innings = new InningDetails[2];
        this.matchType = matchType;
    }

    public void startMatch() throws Exception {
//        1. TOSS
        tossWinner = toss(teamA, teamB);

//        2. Start the INNINGS
//        THERE ARE 2 INNINGS IN A MATCH
        for(int inning=1; inning<=2; inning++){
            InningDetails inningDetails;
            Team bowlingTeam;
            Team battingTeam;

            boolean isChasing = false;
            if (inning == 1) {
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())?teamB:teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(-1);
            } else {
                bowlingTeam = tossWinner;
                battingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())?teamB:teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()){
                    bowlingTeam.isWinner = true;
                }
            }

            innings[inning-1] = inningDetails;

//            PRINT INNINGS DETAILS
            System.out.println("---------------------------------------------");
            System.out.println("Innings: "+inning+" -- TotalRuns: "+battingTeam.getTotalRuns());
            System.out.println("--Batting ScoreCard: "+battingTeam.teamName+"----");
//            PRINTING BATTING TEAM SCORECARD
            battingTeam.printBattingScoreCard();

            System.out.println("---------------------------------------------");
            System.out.println("--Bowling ScoreCard: "+bowlingTeam.teamName+"---");
//            PRINTING BOWLING TEAM SCORECARD
            bowlingTeam.printBowlingScoreCard();
        }

        System.out.println("-----------------------------\n\n");
        if(teamA.isWinner){
            System.out.println("------------------Winner----------------\n"+teamA.teamName);
        } else {
            System.out.println("------------------Winner----------------\n"+teamB.teamName);
        }
    }

    private Team toss(Team teamA, Team teamB){
//        Random function
//        which return value between
//        0 to 1
        return Math.random() < 0.5 ? teamA : teamB;
    }
}
