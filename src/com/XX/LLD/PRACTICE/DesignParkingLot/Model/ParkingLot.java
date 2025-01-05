package com.XX.LLD.PRACTICE.DesignParkingLot.Model;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidSlotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.ParkingLotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.SlotAlreadyOccupiedException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private final int MAX_CAPACITY = 100_000;
    private int capacity;
    private Map<Integer, Slot> slots;

    public ParkingLot(int capacity) {
        if(capacity > MAX_CAPACITY || capacity <= 0){
            throw new ParkingLotException("Invalid Capacity given for parking lot");
        }
        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public int getCapacity() {
        return capacity;
    }

    public Map<Integer, Slot> getSlots() {
        return slots;
    }

    /**
     * Helper method to get a {@link Slot} object for a given slot number. If slot does not exists,
     * then new slot will be created before giving it back.
     *
     * @param slotNumber Slot number.
     * @return Slot.
     */
    public Slot getSlot(int slotNumber){
        if(slotNumber > getCapacity() || slotNumber <= 0){
            throw new InvalidSlotException();
        }

        Map<Integer, Slot> allSlots = getSlots();
        if(!allSlots.containsKey(slotNumber)){
            allSlots.put(slotNumber, new Slot(slotNumber));
        }
        return allSlots.get(slotNumber);
    }

    /**
     * Parks a car into a given slot number.
     *
     * @param car Car to be parked.
     * @param slotNumber Slot number in which it has to be parked.
     * @return {@link Slot} if the parking succeeds. If the slot is already occupied then {@link
     *     SlotAlreadyOccupiedException} is thrown.
     */
    public Slot park(Car car, int slotNumber){
        Slot slot = getSlot(slotNumber);
        if(!slot.isSlotFree()){
            throw new SlotAlreadyOccupiedException();
        }
        slot.assignCar(car);
        return slot;
    }

    /**
     * Makes the slot free from the current parked car.
     *
     * @param slotNumber Slot number to be freed.
     * @return Freed slot.
     */
    public Slot makeSlotFree(int slotNumber){
        Slot slot = getSlot(slotNumber);
        slot.unassignCar();
        return slot;
    }
}
