package com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression;

import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Context;

public interface AbstractExpression {
    public int interpret(Context context);
}
