package com.XX.LLD.PRACTICE.DesignParkingLot.Test.Model.ParkingStrategy;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.NoFreeSlotAvailableException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategyImplementation;
import org.junit.Test;

public class ParkingStrategyImplementationTest {

    private ParkingStrategyImplementation parkingStrategyImplementation = new ParkingStrategyImplementation();

    @Test
    public void testValidStrategyExecution(){
        parkingStrategyImplementation.addSlot(1);
        parkingStrategyImplementation.addSlot(2);
        parkingStrategyImplementation.addSlot(3);
        System.out.println("Next Slot is: "+parkingStrategyImplementation.getNextSlot());
        parkingStrategyImplementation.removeSlot(2);
        System.out.println("Next Slot is: "+parkingStrategyImplementation.getNextSlot());
        parkingStrategyImplementation.removeSlot(1);
        System.out.println("Next Slot is: "+parkingStrategyImplementation.getNextSlot());
        parkingStrategyImplementation.addSlot(2);
        System.out.println("Next Slot is: "+parkingStrategyImplementation.getNextSlot());
    }

    @Test(expected = NoFreeSlotAvailableException.class)
    public void testFullParkingStrategy() {
        int nextSlot = parkingStrategyImplementation.getNextSlot();
        System.out.println("Next Slot is: "+nextSlot);
    }
}
