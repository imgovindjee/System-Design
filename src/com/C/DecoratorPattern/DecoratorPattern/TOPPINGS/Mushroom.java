package com.C.DecoratorPattern.DecoratorPattern.TOPPINGS;

import com.C.DecoratorPattern.DecoratorPattern.Pizza.BasePizza;


public class Mushroom extends Toppings{

    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) { // Constructor
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
