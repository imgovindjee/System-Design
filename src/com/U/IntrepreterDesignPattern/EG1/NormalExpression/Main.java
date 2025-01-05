package com.U.IntrepreterDesignPattern.EG1.NormalExpression;

import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Context;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.AbstractExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.NonTerminalExpression.MultiplyNonTerminalExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.NonTerminalExpression.SubtractNonTerminalExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.NonTerminalExpression.SumNonTerminalExpression;
import com.U.IntrepreterDesignPattern.EG1.NormalExpression.Expression.TerminalExpression.NumberTerminalExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 1);
        context.put("b", 12);
        context.put("c", 30);
        context.put("d",20);

//        (a+b) * (c-d)
        AbstractExpression expression = new MultiplyNonTerminalExpression(
                new SumNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new SubtractNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println(expression.interpret(context));
    }
}
