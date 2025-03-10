package com.H.NullObjectPatternIMPORTANT.Problem;

import com.H.NullObjectPatternIMPORTANT.Problem.Vehicle.Vehicle;


public class problemDetails {
    public void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity:- " +vehicle.getSeatCapacity());
        System.out.println("Fuel tank Capacity:- " +vehicle.getFuelCapacity());
    }

    public static void main(String[] args){
        problemDetails problemDetails1= new problemDetails();
        problemDetails1.printVehicleDetails(new Vehicle());
    }
}
