package com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.NonTerminalExpression;

import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Context;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.AbstractExpression;

public class AddNonTerminalExpression implements AbstractExpression {
    AbstractExpression left_abstractExpression;
    AbstractExpression right_abstractExpression;

    //    CONSTRUCTOR
    public AddNonTerminalExpression(AbstractExpression left_abstractExpression, AbstractExpression right_abstractExpression) {
        this.left_abstractExpression = left_abstractExpression;
        this.right_abstractExpression = right_abstractExpression;
    }

    @Override
    public int interpret(Context context) {
        return left_abstractExpression.interpret(context) + right_abstractExpression.interpret(context);
    }
}
