package com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.NoFreeSlotAvailableException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategy;

import java.util.TreeSet;

public class ParkingStrategyImplementation implements ParkingStrategy {

    TreeSet<Integer> slot_treeSet;

    public ParkingStrategyImplementation(){
        this.slot_treeSet = new TreeSet<>();
    }

    @Override
    public void addSlot(int slotNumber) {
        this.slot_treeSet.add(slotNumber);
    }

    @Override
    public void removeSlot(int slotNumber) {
        this.slot_treeSet.remove(slotNumber);
    }

    @Override
    public int getNextSlot() {
        if(slot_treeSet.isEmpty()){
            throw new NoFreeSlotAvailableException();
        }
        return this.slot_treeSet.first();
    }
}
