package com.AA.AllPattern.StructuralDesignPattern.Adaptee.Adaptor;

import com.AA.AllPattern.StructuralDesignPattern.Adaptee.Adaptee.WeightMachine;

public class WeightMachineAdaptorImplementation implements WeightMachineAdaptor{

    WeightMachine weightMachine;

//    CONSTRUCTOR
    public WeightMachineAdaptorImplementation(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKG() {
        int wtInPounds = weightMachine.getWeightInPound();
        return wtInPounds*0.45;
    }
}
