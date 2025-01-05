package com.U.IntrepreterDesignPattern.EG2.BinaryExpression;

import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.AbstractExpression;
import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.BinaryNonTerminalExpression.BinaryNonTerminalExpression;
import com.U.IntrepreterDesignPattern.EG2.BinaryExpression.Expression.TerminalExpression.NumberTerminalExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 1);
        context.put("b", 12);
        context.put("c", 30);
        context.put("d",20);

//        (a+b) * (c-d)
        AbstractExpression exp = new BinaryNonTerminalExpression(
                new BinaryNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '+'),
                new BinaryNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"), '-'),
                '*');
        System.out.println(exp.interpret(context));
    }
}
