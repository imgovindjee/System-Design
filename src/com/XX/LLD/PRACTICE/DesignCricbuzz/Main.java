package com.XX.LLD.PRACTICE.DesignCricbuzz;

import com.XX.LLD.PRACTICE.DesignCricbuzz.MatchType.MatchType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.MatchType.T20MatchType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.Person;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerType;
import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    private PlayerDetails addPlayer(String name, PlayerType playerType){
        Person person = new Person();
        person.name = name;
        return new PlayerDetails(person, playerType);
    }

    private Team addTeam(String name) {
        Queue<PlayerDetails> playerDetails = new LinkedList<>();

//        CRATING PlAYER
        PlayerDetails p1 = addPlayer(name+"1", PlayerType.BATSMAN);
        PlayerDetails p2 = addPlayer(name+"2", PlayerType.BATSMAN);
        PlayerDetails p3 = addPlayer(name+"3", PlayerType.BATSMAN);
        PlayerDetails p4 = addPlayer(name+"4", PlayerType.ALLROUNDER);
        PlayerDetails p5 = addPlayer(name+"5", PlayerType.WICKETKEEPER);
        PlayerDetails p6 = addPlayer(name+"6", PlayerType.ALLROUNDER);
        PlayerDetails p7 = addPlayer(name+"7", PlayerType.ALLROUNDER);
        PlayerDetails p8 = addPlayer(name+"8", PlayerType.ALLROUNDER);
        PlayerDetails p9 = addPlayer(name+"9", PlayerType.BOWLER);
        PlayerDetails p10 = addPlayer(name+"10", PlayerType.BOWLER);
        PlayerDetails p11 = addPlayer(name+"11", PlayerType.BOWLER);

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        List<PlayerDetails> bowler = new ArrayList<>();
        bowler.add(p9);
        bowler.add(p10);
        bowler.add(p11);
        bowler.add(p8);
        bowler.add(p7);
        bowler.add(p6);
        bowler.add(p4);

        return new Team(name, playerDetails, new ArrayList<>(), bowler);
    }



//    DRIVE CODE
    public static void main(String[] args) {
        try {
            Main main = new Main();

            Team teamA = main.addTeam("INDIA");
            Team teamB = main.addTeam("AUSTRALIA");

            MatchType matchType = new T20MatchType();
            Match match = new Match(teamA, teamB, null, "OPTUS STADIUM", matchType);
            match.startMatch();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
