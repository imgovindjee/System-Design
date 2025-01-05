package com.T.TempletDesignPattern;

import com.T.TempletDesignPattern.Payment.PayToFriend;
import com.T.TempletDesignPattern.Payment.PayToMerchant;
import com.T.TempletDesignPattern.Payment.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------PAY-TO-FRIEND-------------------------------------------");
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        System.out.println("---------------------------------------PAY-TO-MERCHANT-----------------------------------------");
        PaymentFlow payToMetchant = new PayToMerchant();
        payToMetchant.sendMoney();
    }
}
