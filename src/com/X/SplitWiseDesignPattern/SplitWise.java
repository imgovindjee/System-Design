package com.X.SplitWiseDesignPattern;

import com.X.SplitWiseDesignPattern.Expense.ExpenseSplitType;
import com.X.SplitWiseDesignPattern.Expense.Split.Split;
import com.X.SplitWiseDesignPattern.Group.Group;
import com.X.SplitWiseDesignPattern.Group.GroupController;
import com.X.SplitWiseDesignPattern.User.User;
import com.X.SplitWiseDesignPattern.User.UserController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SplitWise {

    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    public SplitWise(){
        this.balanceSheetController = new BalanceSheetController();
        this.groupController = new GroupController();
        this.userController = new UserController();
    }

    public void run(){
        setUpUserAndGroup();

//        Step-1: ADD MEMBERS TO THE GROUP
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

//        STEP-2: CREATE AN EXPENSE INSIDE A GROUP
        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"), 20000);
        Split split2 = new Split(userController.getUser("U2001"), 22000);
        Split split3 = new Split(userController.getUser("U3001"), 23000);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("EXP1001", "BreakFast", 650000, splits, ExpenseSplitType.EQUAL, userController.getUser("U1001"));

        List<Split> splits_ = new ArrayList<>();
        Split split_1 = new Split(userController.getUser("U1001"), 400);
        Split split_2 = new Split(userController.getUser("U2001"), 210);
        splits_.add(split_1);
        splits_.add(split_2);
        group.createExpense("EXP1002", "Lunch", 510, splits_, ExpenseSplitType.UNEQUAL, userController.getUser("U2001"));

        for (User user: userController.getAllUsers()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    private void setUpUserAndGroup(){
//        onboard user to splitWise app
        addUserToSplitwiseApp();

//        Create a group by user1
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001", "Group-1", user1);
    }

    private void addUserToSplitwiseApp() {
//        Adding user1
        User user1 = new User("U1001", "user1");
//        Adding user2
        User user2 = new User("U2001", "user2");
//        ADDING USER3
        User user3 = new User("U3001", "user3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
