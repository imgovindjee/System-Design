package com.X.SplitWiseDesignPattern.Expense;

import com.X.SplitWiseDesignPattern.Expense.Split.Split;
import com.X.SplitWiseDesignPattern.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    String expenseID;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType expenseSplitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseID, String description,
                   double expenseAmount, User paidByUser,
                   ExpenseSplitType expenseSplitType, List<Split> splitDetails) {
        this.expenseID = expenseID;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByUser = paidByUser;
        this.expenseSplitType = expenseSplitType;
        this.splitDetails.addAll(splitDetails);
    }
}
