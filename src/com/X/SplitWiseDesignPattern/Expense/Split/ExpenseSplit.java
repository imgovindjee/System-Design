package com.X.SplitWiseDesignPattern.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
    public void validateSplitRequest(List<Split> splits, double totalAmount);
}
