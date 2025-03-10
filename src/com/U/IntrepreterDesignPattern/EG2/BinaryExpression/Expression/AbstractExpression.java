package com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression;

import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Context;

public interface AbstractExpression {
    public int interpret(Context context);
}
