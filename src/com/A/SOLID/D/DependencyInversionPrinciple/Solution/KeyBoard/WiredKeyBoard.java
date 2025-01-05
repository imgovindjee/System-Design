package com.A.SOLID.D.DependencyInversionPrinciple.Solution.KeyBoard;

public class WiredKeyBoard implements KeyBoard{
    @Override
    public void keyBoardType() {
        System.out.println("Wired KeyBoard");
    }
}
