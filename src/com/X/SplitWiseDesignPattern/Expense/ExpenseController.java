package com.X.SplitWiseDesignPattern.Expense;

import com.X.SplitWiseDesignPattern.BalanceSheetController;
import com.X.SplitWiseDesignPattern.Expense.Split.ExpenseSplit;
import com.X.SplitWiseDesignPattern.Expense.Split.Split;
import com.X.SplitWiseDesignPattern.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseID, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        ExpenseSplit expenseSplit = new SplitFactory().getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseID, description, expenseAmount, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        return expense;
    }
}
