package com.AA.AllPattern.StructuralDesignPattern.Adaptee;

import com.AA.AllPattern.StructuralDesignPattern.Adaptee.Adaptee.WeightMachineImplementation;
import com.AA.AllPattern.StructuralDesignPattern.Adaptee.Adaptor.WeightMachineAdaptor;
import com.AA.AllPattern.StructuralDesignPattern.Adaptee.Adaptor.WeightMachineAdaptorImplementation;

public class Main {
    public static void main(String[] args){
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImplementation(new WeightMachineImplementation());
        System.out.println(weightMachineAdaptor.getWeightInKG());
    }
}
