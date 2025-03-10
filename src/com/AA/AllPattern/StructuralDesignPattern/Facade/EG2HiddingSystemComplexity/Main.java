package com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity;

import com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity.Facade.ACFacade;

public class Main {
    public static void main(String[] args) {
        ACFacade acFacade = new ACFacade();
        acFacade.turnOnButtonClick();
    }
}
