package com.I.CompositeDesignPattern.Solution2ForAirthmeticExpression;

public class Main {
    public static void main(String[] args) {
//        2*(1+7)
 /*
                    *
                   / \
                  2   +
                     / \
                    1   7
 */
        AirthmeticExpression two = new Number(2);
        AirthmeticExpression one = new Number(1);
        AirthmeticExpression seven = new Number(7);

//        Internal expression
        AirthmeticExpression additionOperation = new Expression(one, seven, Operation.ADD);
//        Final Expression
        AirthmeticExpression parentalOperation = new Expression(additionOperation, two, Operation.MULTIPLY);
        System.out.println("------------------------------------------------------------------------------------------"
                + "\nThe final result is: " +parentalOperation.evaluate());
    }
}
