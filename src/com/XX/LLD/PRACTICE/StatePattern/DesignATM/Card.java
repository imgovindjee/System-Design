package com.XX.LLD.PRACTICE.StatePattern.DesignATM;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.User.UserBankAmount;

public class Card {

//    CARD DETAILS CONTAINED
    private int cardNumber;
    private int cvv;
    private int expireDate;
    private String holderName;
    private static int PIN_NUMBER = 000000;
    private UserBankAmount userBankAmount;

    public void setBankAccount(UserBankAmount userBankAmount){
        this.userBankAmount = userBankAmount;
    }

    public int getBankBalance(){
        return userBankAmount.getBalance();
    }

    public void deductBankBalance(int amount){
        userBankAmount.withDrawalBalance(amount);
    }

    public boolean isPinCorrect(int pin){
        return pin == PIN_NUMBER;
    }
}
