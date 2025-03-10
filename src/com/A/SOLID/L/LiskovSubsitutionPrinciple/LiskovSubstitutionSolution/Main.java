package com.A.SOLID.L.LiskovSubsitutionPrinciple.LiskovSubstitutionSolution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new bicycle());
        vehicleList.add(new car());
        vehicleList.add(new mototCycle());

        for(Vehicle vl : vehicleList){
            System.out.println(vl.getNumberOfWheels().toString());
        }
    }
}
