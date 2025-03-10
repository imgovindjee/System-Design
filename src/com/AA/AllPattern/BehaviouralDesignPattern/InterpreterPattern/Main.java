package com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.AbstractExpression;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.NonTerminalExpression.AddNonTerminalExpression;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.NonTerminalExpression.DivideNonTerminalExpression;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.NonTerminalExpression.MultiplyNonTerminalExpression;
import com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern.Expression.Terminal.NumberTerminalExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 3);
        context.put("c", 10);

        AbstractExpression exp1 = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"),
                new AddNonTerminalExpression(
                        new NumberTerminalExpression("b"), new NumberTerminalExpression("c")
                ));
        AbstractExpression exp2 = new DivideNonTerminalExpression(
                new NumberTerminalExpression("c"),
                new AddNonTerminalExpression(
                        new NumberTerminalExpression("b"), new NumberTerminalExpression("a")
                ));
        System.out.println(exp1.interpret(context));
        System.out.println(exp2.interpret(context));
    }
}
