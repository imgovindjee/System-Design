package com.A.SOLID.D.DependencyInversionPrinciple.Solution.Mouse;

public class BluetoothMouse implements Mouse{
    @Override
    public void mouseType() {
        System.out.println("Bluetooth Mouse");
    }
}
