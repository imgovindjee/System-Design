package com.AA.AllPattern.StructuralDesignPattern.Bridge;

import com.AA.AllPattern.StructuralDesignPattern.Bridge.System.Fish;
import com.AA.AllPattern.StructuralDesignPattern.Bridge.System.LivingThings;
import com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor.WaterBreathe;

public class Main {
    public static void main(String[] args) {
        LivingThings livingThingsObject = new Fish(new WaterBreathe());
        livingThingsObject.breatheProcess();
    }
}
