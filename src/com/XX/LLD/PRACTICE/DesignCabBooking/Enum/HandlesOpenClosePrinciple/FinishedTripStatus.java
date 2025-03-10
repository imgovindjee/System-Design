package com.XX.LLD.PRACTICE.DesignCabBooking.Enum.HandlesOpenClosePrinciple;

public class FinishedTripStatus implements TripStatus{

    @Override
    public String getTripStatus() {
        return "FINISHED";
    }
}
