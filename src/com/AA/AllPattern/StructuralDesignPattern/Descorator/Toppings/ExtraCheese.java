package com.AA.AllPattern.StructuralDesignPattern.Descorator.Toppings;

import com.AA.AllPattern.StructuralDesignPattern.Descorator.Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
