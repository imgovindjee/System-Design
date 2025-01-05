package com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.Terminal;

import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Context;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.AbstractExpression;

public class NumberTerminalExpression implements AbstractExpression {
    String stringValue;

//    CONSTRUCTOR
    public NumberTerminalExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
