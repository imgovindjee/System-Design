package com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.NonTerminalExpression;

import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.AbstractExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Context;

public class MultiplyNonTerminalExpression implements AbstractExpression {
    AbstractExpression left_abstractExpression;
    AbstractExpression right_abstractExpression;

//    CONSTRUCTOR
    public MultiplyNonTerminalExpression(AbstractExpression left_abstractExpression, AbstractExpression right_abstractExpression) {
        this.left_abstractExpression = left_abstractExpression;
        this.right_abstractExpression = right_abstractExpression;
    }

    @Override
    public int interpret(Context context) {
        return left_abstractExpression.interpret(context) * right_abstractExpression.interpret(context);
    }
}
