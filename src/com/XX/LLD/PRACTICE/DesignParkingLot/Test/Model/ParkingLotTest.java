package com.XX.LLD.PRACTICE.DesignParkingLot.Test.Model;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidSlotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.ParkingLotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.SlotAlreadyOccupiedException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Car;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingLot;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;
import org.junit.Test;

public class ParkingLotTest {

    @Test(expected = ParkingLotException.class)
    public void testNegativeCapacity(){
        new ParkingLot(-1);
    }

    @Test(expected = ParkingLotException.class)
    public void testZeroCapacity(){
        new ParkingLot(0);
    }

    @Test
    public void testValidCapacity(){
        new ParkingLot(100);
    }

    @Test(expected = ParkingLotException.class)
    public void testMoreThanMaxCapacity(){
        new ParkingLot(1000000);
    }

    @Test
    public void testParkingCar(){
        Car testCar = new Car("REG. CAR NUMBER", "WHITE");
        ParkingLot parkingLot = new ParkingLot(100);
        Slot slot = parkingLot.park(testCar, 1);
        System.out.println("Car with registrationNumber "+testCar.getRegistrationNumber()+" is parked in slot-"+slot);
    }

    @Test(expected = SlotAlreadyOccupiedException.class)
    public void testParkingOnAlreadyOccupiedSlot(){
        Car testCar1 = new Car("C1", "W-1");
        Car testCar2 = new Car("C2", "B-1");

        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.park(testCar1, 1);
        parkingLot.park(testCar2, 1);
    }

    @Test(expected = InvalidSlotException.class)
    public void testParkingAtSlotHigherThanCapacity(){
        Car testCar1 = new Car("c1", "b1");
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.park(testCar1, 101);
    }

    @Test(expected = InvalidSlotException.class)
    public void testParkingAtSlotInvalidSlot(){
        Car testCar1 = new Car("c1", "b1");
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.park(testCar1, 0);
    }

    @Test
    public void testMakingSlotFree(){
        Car testCar1 = new Car("c1", "b1");
        ParkingLot parkingLot = new ParkingLot(100);

        Slot parkedSlot = parkingLot.park(testCar1, 10);
        System.out.println("Current Slot is Free: "+parkedSlot.isSlotFree());

        Slot freeSlot = parkingLot.makeSlotFree(10);
        System.out.println("Current Slot is Free: "+freeSlot.isSlotFree());
    }

    @Test(expected = InvalidSlotException.class)
    public void testMakingSlotHigherThanCapacityFree() {
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.makeSlotFree(101);
    }

    @Test(expected = InvalidSlotException.class)
    public void testMakingInvalidSlotFree() {
        ParkingLot parkingLot = new ParkingLot(100);
        parkingLot.makeSlotFree(-1);
    }
}
