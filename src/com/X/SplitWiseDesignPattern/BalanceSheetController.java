package com.X.SplitWiseDesignPattern;

import com.X.SplitWiseDesignPattern.Balance;
import com.X.SplitWiseDesignPattern.Expense.Split.Split;
import com.X.SplitWiseDesignPattern.User.User;
import com.X.SplitWiseDesignPattern.UserExpenseBalanceSheet;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount){
        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

        for (Split split:splits){
            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseSheet = userOwe.getUserExpenseBalanceSheet();
            double oweAmount = split.getAmountOwe();

            if(expensePaidBy.getUserID().equals(userOwe.getUserID())){
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + oweAmount);
            } else {
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYourExpense()+oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseSheet.getUser_balance().containsKey(userOwe.getUserID())){
                    userOweBalance = paidByUserExpenseSheet.getUser_balance().get(userOwe.getUserID());
                } else {
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getUser_balance().put(userOwe.getUserID(), userOweBalance);
                }
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);

//                UPDATE THE BALANCE SHEET OF OWE USER
                oweUserExpenseSheet.setTotalYouOwe(oweUserExpenseSheet.getTotalYouOwe() + oweAmount);
                oweUserExpenseSheet.setTotalYourExpense(oweUserExpenseSheet.getTotalYourExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpenseSheet.getUser_balance().containsKey(expensePaidBy.getUserID())){
                    userPaidBalance = oweUserExpenseSheet.getUser_balance().get(expensePaidBy.getUserID());
                } else {
                    userPaidBalance = new Balance();
                    oweUserExpenseSheet.getUser_balance().put(expensePaidBy.getUserID(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){
        System.out.println("----------------------------------------------------------------------\n" +
                "Balance Sheet of User: "+user.getUserID());

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();
        System.out.println("TotalYourExpense: "+userExpenseBalanceSheet.getTotalYourExpense()+
                "\nTotalGetBack: "+userExpenseBalanceSheet.getTotalYouGetBack()+
                "\nTotalYourOwe: "+userExpenseBalanceSheet.getTotalYouOwe()+
                "\nTotalPaymentMade: "+userExpenseBalanceSheet.getTotalPayment());

        for (Map.Entry<String, Balance> entry: userExpenseBalanceSheet.getUser_balance().entrySet()){
            String userID = entry.getKey();
            Balance balance = entry.getValue();
            System.out.println("UserID: "+userID+
                    "\nYouGetBack: "+balance.getAmountGetBack()+
                    "\nYouOwe: "+balance.getAmountOwe());
        }

        System.out.println("----------------------------------------------------------------------");
    }
}
