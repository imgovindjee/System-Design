package com.XX.LLD.PRACTICE.DesignParkingLot.Service;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.ParkingLotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Car;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingLot;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategy;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

//    CREATING THE PARKING LOT
    public void createParkingLot(ParkingLot parkingLot, ParkingStrategy parkingStrategy){
//        EDGE
        if(this.parkingLot != null){
            throw new ParkingLotException("Parking Lot Already Exists");
        } else {
            this.parkingLot = parkingLot;
            this.parkingStrategy = parkingStrategy;

            for(int i=1; i<=parkingLot.getCapacity(); i++){
                parkingStrategy.addSlot(i);
            }
        }
    }

//    PARK THE CAR
    public int park(Car car){
//        DO PARKING LOT EXISTS OR NOT
        validateParkingLotExists();

        int nextFreeSlot = parkingStrategy.getNextSlot();
        parkingLot.park(car, nextFreeSlot);
        parkingStrategy.removeSlot(nextFreeSlot);
        System.out.println("Car with registrationNumber: "+car.getRegistrationNumber()+" is parked on slot: "+nextFreeSlot);
        return nextFreeSlot;
    }

//    MAKE THE SLOT FREE
//    .I.E. REMOVE THE CAR PARKED OVER THEIR
    public void makeSlotFree(int slotNumber){
//        DO PARKING LOT EXISTS OR NOT
        validateParkingLotExists();

        parkingLot.makeSlotFree(slotNumber);
        parkingStrategy.addSlot(slotNumber);
    }

//    GET THE LIST OF ALL OCCUPIED SLOTS IN THE PARKING AREA
    public List<Slot> getOccupiedSlots(){
//        DO PARKING LOT EXISTS OR NOT
        validateParkingLotExists();

        List<Slot> occupiedSlots = new ArrayList<>();
        Map<Integer, Slot> allSlots = new HashMap<>();
        for(int i=1; i<=parkingLot.getCapacity(); i++){
            if(allSlots.containsKey(i)){
                Slot slot = allSlots.get(i);
                if(!slot.isSlotFree()){
                    occupiedSlots.add(slot);
                }
            }
        }
        return occupiedSlots;
    }

//    GET LIST OF ALL THE CAR SLOT WITH COLOR GIVEN, PARKED OVER THEIR
    public List<Slot> getSlotForColor(String color){
        List<Slot> occupiedSlot = getOccupiedSlots();
        return occupiedSlot.stream()
                .filter(slot -> slot.getParkedCar().getCarColor().equals(color))
                .collect(Collectors.toList());
    }

//    DO PARKING LOT EXISTS OR NOT
    private void validateParkingLotExists(){
        if(parkingLot == null){
            throw new ParkingLotException("parking Lot Does not exists to park.");
        }
    }
}
