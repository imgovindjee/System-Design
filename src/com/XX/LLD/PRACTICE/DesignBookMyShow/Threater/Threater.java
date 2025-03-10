package com.XX.LLD.PRACTICE.DesignBookMyShow.Threater;

import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.City;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Screen;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Show;

import java.util.ArrayList;
import java.util.List;

public class Threater {

    int threaterID;
    String threater_address;
    City city;
    List<Screen> screenList = new ArrayList<>();
    List<Show> showList = new ArrayList<>();

    public int getThreaterID() {
        return threaterID;
    }

    public void setThreaterID(int threaterID) {
        this.threaterID = threaterID;
    }

    public String getThreater_address() {
        return threater_address;
    }

    public void setThreater_address(String threater_address) {
        this.threater_address = threater_address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
