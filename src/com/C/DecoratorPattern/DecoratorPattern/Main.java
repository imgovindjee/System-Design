package com.C.DecoratorPattern.DecoratorPattern;

import com.C.DecoratorPattern.DecoratorPattern.Pizza.FarmHouse;
import com.C.DecoratorPattern.DecoratorPattern.Pizza.Margherita;
import com.C.DecoratorPattern.DecoratorPattern.TOPPINGS.ExtraChess;
import com.C.DecoratorPattern.DecoratorPattern.Pizza.BasePizza;
import com.C.DecoratorPattern.DecoratorPattern.TOPPINGS.Mushroom;

public class Main {
    public static void main(String[] args){
        BasePizza basePizza1 = new ExtraChess(new FarmHouse());
        System.out.println(basePizza1.cost());

        BasePizza basePizza2 = new ExtraChess(new Mushroom(new Margherita()));
        System.out.println(basePizza2.cost());
    }
}
