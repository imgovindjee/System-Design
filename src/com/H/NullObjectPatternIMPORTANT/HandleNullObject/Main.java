package com.H.NullObjectPatternIMPORTANT.HandleNullObject;

import com.H.NullObjectPatternIMPORTANT.HandleNullObject.VEHICLE.Vehicles;

public class Main {

    public void printVehicleDetails(Vehicles vehicles) {
        System.out.println("Seat Capacity:- " +vehicles.getSeatCapacity());
        System.out.println("Seat Capacity:- " +vehicles.getFuelCapacity());
    }


//    DRIVE CODE
    public static void main(String[] args){
        Main main = new Main();
        main.printVehicleDetails(VehicleFactory.getVehicleObject("Bike"));
        main.printVehicleDetails(VehicleFactory.getVehicleObject("Car"));
    }
}
