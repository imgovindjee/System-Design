package com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerController;

import com.XX.LLD.PRACTICE.DesignCricbuzz.Team.Player.PlayerDetails;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {

    Queue<PlayerDetails> yetToPlay;
    PlayerDetails striker;
    PlayerDetails nonStriker;

//    CONSTRUCTOR INJECTION
    public PlayerBattingController(Queue<PlayerDetails> whole11Player) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(whole11Player);
    }

    public void getNextPlayer() throws Exception {
        if(yetToPlay.isEmpty()){
            throw new Exception();
        }

        if(striker == null){
            striker = yetToPlay.poll();
        }
        if(nonStriker == null){
            nonStriker = yetToPlay.poll();
        }
    }

    public PlayerDetails getStriker(){
        return striker;
    }

    public PlayerDetails getNonStriker(){
        return nonStriker;
    }

    public void setStriker(PlayerDetails striker) {
        this.striker = striker;
    }

    public void setNonStriker(PlayerDetails nonStriker) {
        this.nonStriker = nonStriker;
    }
}
