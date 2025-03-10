package com.A.SOLID.D.DependencyInversionPrinciple.Solution.Mouse;

public class WiredMouse implements Mouse{
    @Override
    public void mouseType() {
        System.out.println("Wired Mouse");
    }
}
