package com.XX.LLD.PRACTICE.DesignParkingLot.Test.Service;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.ParkingLotException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Car;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingLot;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategy;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategyImplementation;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotServiceTest {

    private ParkingLotService parkingLotService = new ParkingLotService();
    private ParkingStrategy parkingStrategy;
    private ParkingLot parkingLot;

    @Before
    public void setUp() throws Exception{
        parkingLotService.createParkingLot(parkingLot, parkingStrategy);
    }

    @Test(expected = ParkingLotException.class)
    public void testCreatingParkingLotWhenAlreadyExists() {
        ParkingLotService parkingLotService = new ParkingLotService();
        parkingLotService.createParkingLot(new ParkingLot(10), new ParkingStrategyImplementation());
        parkingLotService.createParkingLot(new ParkingLot(20), new ParkingStrategyImplementation());
    }

    @Test
    public void testSlotNumberIsRemovedFromStrategyAfterParking(){
        Car testCar = new Car("c1", "W-1");
        int parking_slotNumber = parkingStrategy.getNextSlot();
        parkingLotService.park(testCar);
        System.out.println("Car parked to: "+parkingLot.park(testCar, parking_slotNumber));
    }

    @Test(expected = ParkingLotException.class)
    public void testParkingCarWithOutCreatingParkingLot(){
        ParkingLotService parkingLotService = new ParkingLotService();
        Car testCar = new Car("c1", "b1");
        parkingLotService.park(testCar);
    }
}
