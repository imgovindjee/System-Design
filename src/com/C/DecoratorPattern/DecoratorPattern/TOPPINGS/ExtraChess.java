package com.C.DecoratorPattern.DecoratorPattern.TOPPINGS;

import com.C.DecoratorPattern.DecoratorPattern.Pizza.BasePizza;


public class ExtraChess extends Toppings{

    BasePizza basePizza;
    public ExtraChess(BasePizza basePizza) { // Constructor
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
