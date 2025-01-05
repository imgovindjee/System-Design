package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private String theatreID;
    private String theatreName;
    private List<Screen> screens;

    public Theatre(String theatreID, String theatreName) {
        this.theatreID = theatreID;
        this.theatreName = theatreName;
        this.screens = new ArrayList<>();
    }

    public String getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(String theatreID) {
        this.theatreID = theatreID;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void addScreen(Screen screen){
        screens.add(screen);
    }
}
