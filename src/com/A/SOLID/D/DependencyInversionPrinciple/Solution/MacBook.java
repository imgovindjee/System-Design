package com.A.SOLID.D.DependencyInversionPrinciple.Solution;

import com.A.SOLID.D.DependencyInversionPrinciple.Solution.KeyBoard.WiredKeyBoard;
import com.A.SOLID.D.DependencyInversionPrinciple.Solution.Mouse.WiredMouse;

public class MacBook {
    private final WiredKeyBoard keyBoard;
    private final WiredMouse mouse;

    public MacBook() {
        this.keyBoard = new WiredKeyBoard();
        this.mouse = new WiredMouse();
    }

    public void print() {
        keyBoard.keyBoardType();
        mouse.mouseType();
    }
}
