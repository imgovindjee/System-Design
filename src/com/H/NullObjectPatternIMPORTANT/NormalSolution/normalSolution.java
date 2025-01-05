package com.H.NullObjectPatternIMPORTANT.NormalSolution;

import com.H.NullObjectPatternIMPORTANT.NormalSolution.Vehicle1.Vehicle1;

public class normalSolution {

    public void printVehicleDetails(Vehicle1 vehicle){
        if(vehicle != null) {
            System.out.println("Seating Capacity:- " + vehicle.getSeatCapacity());
            System.out.println("Fuel tank Capacity:- " + vehicle.getFuelCapacity());
        }
    }


//    DRIVE CODE
    public static void main(String[] args) {
        normalSolution normalSolution1 = new normalSolution();
        normalSolution1.printVehicleDetails(new Vehicle1());
    }
}
