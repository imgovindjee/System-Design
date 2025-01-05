package com.J.AdapterDesignPattern.Adaptor;

import com.J.AdapterDesignPattern.Adaptee.WeightedMachine;

public class WeightMachineAdaptorImplementation implements WeightMachineAdaptor{

    WeightedMachine weightedMachine;
    public WeightMachineAdaptorImplementation(WeightedMachine weightedMachine) {
        this.weightedMachine = weightedMachine;
    }

    @Override
    public double getWeightInKg() {
//        getting weight in pound
        double weightInPound = weightedMachine.getWeightInPound();

//        convert POUND's into KG
        double weightInKG = weightInPound * 0.45;
        return weightInKG;
    }
}
