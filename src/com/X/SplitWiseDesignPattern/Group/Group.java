package com.X.SplitWiseDesignPattern.Group;

import com.X.SplitWiseDesignPattern.Expense.Expense;
import com.X.SplitWiseDesignPattern.Expense.ExpenseController;
import com.X.SplitWiseDesignPattern.Expense.ExpenseSplitType;
import com.X.SplitWiseDesignPattern.Expense.Split.Split;
import com.X.SplitWiseDesignPattern.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String groupID;
    private String groupName;
    private List<User> members;
    private List<Expense> expenses;
    private ExpenseController expenseController;

    public Group() {
        this.expenseController = new ExpenseController();
        this.expenses = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

//    ADD MEMBER
    public void addMember(User member) {
        members.add(member);
    }

//    CREATE EXPENSE
    public Expense createExpense(String expenseID, String description, double expenseAmount,
                                 List<Split> splitDetail, ExpenseSplitType splitType, User paidByUser){
        return null;
    }
}
