package com.XX.LLD.PRACTICE.DesignBookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    int screenID;
    List<Seat> seatList = new ArrayList<>();

    public int getScreenID() {
        return screenID;
    }

    public void setScreenID(int screenID) {
        this.screenID = screenID;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
