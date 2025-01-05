package com.XX.LLD.PRACTICE.DesignBookMyShow;

import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.SeatCategory;

public class Seat {

    int seatID;
    int row;
    SeatCategory seatCategory;

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
