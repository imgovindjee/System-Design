package com.I.CompositeDesignPattern.Solution2ForAirthmeticExpression;

public class Number implements AirthmeticExpression{

    int value;
    public Number(int value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is: "+value);
        return value;
    }
}
