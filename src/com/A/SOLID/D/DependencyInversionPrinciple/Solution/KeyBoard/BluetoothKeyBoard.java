package com.A.SOLID.D.DependencyInversionPrinciple.Solution.KeyBoard;

public class BluetoothKeyBoard implements KeyBoard{
    @Override
    public void keyBoardType() {
        System.out.println("Bluetooth KeyBoard");
    }
}
