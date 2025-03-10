package com.XX.LLD.PRACTICE.DesignParkingLot.Model;

public class Slot {

    private Car parkedCar;
    private int slotNumber;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isSlotFree(){
        return parkedCar == null;
    }

    public void assignCar(Car car){
        this.parkedCar = car;
    }

    public void unassignCar() {
        this.parkedCar = null;
    }
}
