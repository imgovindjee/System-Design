package com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.BinaryNonTerminalExpression;

import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Context;
import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.AbstractExpression;

public class BinaryNonTerminalExpression implements AbstractExpression {
    AbstractExpression left_abstractExpression;
    AbstractExpression right_abstractExpression;
    char operator;

//    CONSTRUCTOR
    public BinaryNonTerminalExpression(AbstractExpression left_abstractExpression, AbstractExpression right_abstractExpression, char operator) {
        this.left_abstractExpression = left_abstractExpression;
        this.right_abstractExpression = right_abstractExpression;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        return switch (operator) {
            case '+' -> left_abstractExpression.interpret(context) + right_abstractExpression.interpret(context);
            case '-' -> left_abstractExpression.interpret(context) - right_abstractExpression.interpret(context);
            case '*' -> left_abstractExpression.interpret(context) * right_abstractExpression.interpret(context);
            case '/' -> left_abstractExpression.interpret(context) / right_abstractExpression.interpret(context);
            default -> 0;
        };
    }
}
