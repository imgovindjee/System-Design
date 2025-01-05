package com.M.BridgeDesignPattern;

import com.M.BridgeDesignPattern.System.Dog;
import com.M.BridgeDesignPattern.System.Fish;
import com.M.BridgeDesignPattern.System.LivingThings;
import com.M.BridgeDesignPattern.System.Tree;
import com.M.BridgeDesignPattern.SystemImplementor.LandBreatheImplementor;
import com.M.BridgeDesignPattern.SystemImplementor.TreeBreatheImplementor;
import com.M.BridgeDesignPattern.SystemImplementor.WaterBreatheImplementor;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------");
        LivingThings fish_livingObjeect = new Fish(new WaterBreatheImplementor());
        fish_livingObjeect.breatheProcess();
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------");
        LivingThings tree_livingObject = new Tree(new TreeBreatheImplementor());
        tree_livingObject.breatheProcess();
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------");
        LivingThings dog_livingObject = new Dog(new LandBreatheImplementor());
        dog_livingObject.breatheProcess();
        System.out.println("----------------------------------------------------------------------------");
    }
}
