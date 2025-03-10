package com.J.AdapterDesignPattern;

import com.J.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import com.J.AdapterDesignPattern.Adaptor.WeightMachineAdaptor;
import com.J.AdapterDesignPattern.Adaptor.WeightMachineAdaptorImplementation;


public class Main {
    public static void main(String[] args){
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImplementation(new WeightMachineForBabies());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}
