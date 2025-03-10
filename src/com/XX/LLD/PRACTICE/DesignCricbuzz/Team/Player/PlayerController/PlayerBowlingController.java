package com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerController;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;

import java.util.*;

public class PlayerBowlingController {

    Deque<PlayerDetails> bowlersList;
    Map<PlayerDetails, Integer> bowler_over;
    PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlers) {
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<PlayerDetails> bowlers){
        this.bowlersList = new LinkedList<>();
        bowler_over = new HashMap<>();
        for(PlayerDetails bowler:bowlers){
            this.bowlersList.addLast(bowler);
            bowler_over.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOverPerBowler){
        PlayerDetails playerDetails = bowlersList.poll();
        if (bowler_over.get(playerDetails)+1==maxOverPerBowler){
            currentBowler = playerDetails;
        } else {
            currentBowler = playerDetails;
            bowlersList.addLast(playerDetails);
            bowler_over.put(playerDetails, bowler_over.get(playerDetails));
        }
    }

    public PlayerDetails getCurrentBowler(){
        return currentBowler;
    }

    public void setCurrentBowler(PlayerDetails currentBowler){
        this.currentBowler = currentBowler;
    }
}
