package com.H.NullObjectPatternIMPORTANT.HandleNullObject;

import com.H.NullObjectPatternIMPORTANT.HandleNullObject.VEHICLE.Car;
import com.H.NullObjectPatternIMPORTANT.HandleNullObject.VEHICLE.NullVehicle;
import com.H.NullObjectPatternIMPORTANT.HandleNullObject.VEHICLE.Vehicles;

public class VehicleFactory {
    public static Vehicles getVehicleObject(String typeOfVehicle) {
        if("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
