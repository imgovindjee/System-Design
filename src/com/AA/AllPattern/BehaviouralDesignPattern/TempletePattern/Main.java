package com.AA.AllPattern.BehaviouralDesignPattern.TempletePattern;

import com.AA.AllPattern.BehaviouralDesignPattern.TempletePattern.Payment.PayToFriend;
import com.AA.AllPattern.BehaviouralDesignPattern.TempletePattern.Payment.PayToMerchant;
import com.AA.AllPattern.BehaviouralDesignPattern.TempletePattern.Payment.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------PAY-TO-FRIEND-------------------------------------------");
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        System.out.println("---------------------------------------PAY-TO-MERCHANT-----------------------------------------");
        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
    }
}
