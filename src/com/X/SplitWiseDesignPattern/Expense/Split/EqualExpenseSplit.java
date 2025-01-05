package com.X.SplitWiseDesignPattern.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{

    @Override
    public void validateSplitRequest(List<Split> splits, double totalAmount) {
//        Validate total amount in splits of each user is equal
//        and overall equals to totalAmount or not
        double amountShouldBePresent = totalAmount / splits.size();
        for (Split split:splits){
            if(split.getAmountOwe() != amountShouldBePresent){
                System.out.println("Exception Handle");
            }
        }
    }
}
