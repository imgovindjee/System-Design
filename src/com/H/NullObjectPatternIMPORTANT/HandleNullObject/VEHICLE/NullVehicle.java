package com.H.NullObjectPatternIMPORTANT.HandleNullObject.VEHICLE;

public class NullVehicle implements Vehicles{
    @Override
    public int getFuelCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
