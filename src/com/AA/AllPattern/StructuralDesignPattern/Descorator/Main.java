package com.AA.AllPattern.StructuralDesignPattern.Descorator;

import com.AA.AllPattern.StructuralDesignPattern.Descorator.Pizza.BasePizza;
import com.AA.AllPattern.StructuralDesignPattern.Descorator.Pizza.FarmHousePizza;
import com.AA.AllPattern.StructuralDesignPattern.Descorator.Pizza.MargheritaPizza;
import com.AA.AllPattern.StructuralDesignPattern.Descorator.Toppings.ExtraCheese;
import com.AA.AllPattern.StructuralDesignPattern.Descorator.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza1 = new ExtraCheese(new FarmHousePizza());
        System.out.println(basePizza1.cost());

        BasePizza basePizza2 = new ExtraCheese(new Mushroom(new MargheritaPizza()));
        System.out.println(basePizza2.cost());
    }
}
