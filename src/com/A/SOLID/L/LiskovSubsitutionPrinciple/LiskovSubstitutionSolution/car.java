package com.A.SOLID.L.LiskovSubsitutionPrinciple.LiskovSubstitutionSolution;

public class car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
