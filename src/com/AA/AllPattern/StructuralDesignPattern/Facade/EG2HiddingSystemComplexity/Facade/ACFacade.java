package com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity.Facade;

import com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity.ComplexSystem.ACExternalUnits;
import com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity.ComplexSystem.ACInternalUnits;

public class ACFacade {
    ACExternalUnits acExternalUnits;
    ACInternalUnits acInternalUnits;

    public ACFacade() {
        this.acExternalUnits = new ACExternalUnits();
        this.acInternalUnits = new ACInternalUnits();
    }

    public void turnOnButtonClick() {
        acInternalUnits.acceptUserTemperatureCmd();
        acExternalUnits.checkVoltage();
        acExternalUnits.consumeNitrogen();
        acExternalUnits.startCondenser();
    }
}
