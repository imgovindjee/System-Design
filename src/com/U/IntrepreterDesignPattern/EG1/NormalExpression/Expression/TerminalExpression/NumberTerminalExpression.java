package com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.TerminalExpression;

import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.AbstractExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Context;

public class NumberTerminalExpression implements AbstractExpression {
    String context_string;
    public NumberTerminalExpression(String context_string) {
       this.context_string = context_string;
    }

    @Override
    public int interpret(Context context) {
        return context.get(context_string);
    }
}
