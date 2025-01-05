package com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy;

public interface ParkingStrategy {
    public void addSlot(int slotNumber);
    public void removeSlot(int slotNumber);
    public int getNextSlot();
}
