package com.X.SplitWiseDesignPattern.Expense.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit{

    @Override
    public void validateSplitRequest(List<Split> splits, double totalAmount) {
        System.out.println("Percentage Expense Split");
    }
}
