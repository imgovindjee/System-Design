package com.AA.AllPattern.StructuralDesignPattern.Descorator.Toppings;

import com.AA.AllPattern.StructuralDesignPattern.Descorator.Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 12;
    }
}
