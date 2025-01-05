package com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.TerminalExpression;

import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Context;
import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.AbstractExpression;

public class NumberTerminalExpression implements AbstractExpression {
    String context_string;

//    CONSTRUCTOR
    public NumberTerminalExpression(String context_string) {
        this.context_string = context_string;
    }

    @Override
    public int interpret(Context context) {
        return context.get(context_string);
    }
}
