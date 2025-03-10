package com.I.CompositeDesignPattern.Solution2ForAirthmeticExpression;

public class Expression implements AirthmeticExpression{

    AirthmeticExpression leftExpression;
    AirthmeticExpression rightExpression;
    Operation operation;
    public Expression(AirthmeticExpression leftExpression, AirthmeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD -> value = leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT -> value = leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY -> value = leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE ->  value = leftExpression.evaluate() / rightExpression.evaluate();
        }
        System.out.println("Expression value is: "+value);
        return value;
    }
}
