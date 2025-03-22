package com.XX.LLD.PRACTICE.DesignDigitalWallet.WalletImplementation;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Account;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.BankAccount;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.CreditCard;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.PaymentMethod;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Transaction;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Wallet.DigitalWallet;

import java.math.BigDecimal;
import java.util.List;

public class DigitalWalletImplementation {

    public static void run(){
//        Wallet instance creation
        DigitalWallet digitalWallet = DigitalWallet.getInstance();

//        Create Users
        User user1 = new User("U001", "QWERTY", "qwerty@gmail.com", "password");
        User user2 = new User("U002", "John Doe", "john@gmail.com", "password");
        User user3 = new User("U003", "Akshra", "akshra@gmail.com", "password");

//        create Account
        Account account1 = new Account("A001", user1, "1212221112", Currency.USD);
        Account account2 = new Account("A002", user2, "1737678879", Currency.GBP);
        Account account3 = new Account("A003", user3, "1737678823", Currency.INR);
        digitalWallet.createAccount(account1);
        digitalWallet.createAccount(account2);
        digitalWallet.createAccount(account3);

//        Add payments
        PaymentMethod creditCard = new CreditCard("PM1001", user1, "1234567890123456", "12/12", "133");
        PaymentMethod bankAccount1 = new BankAccount("PM1000", user2, "9876543210", "987654321");
        PaymentMethod bankAccount2 = new BankAccount("PM10002", user3, "9870543210", "987590321");
        digitalWallet.addPaymentMethod(creditCard);
        digitalWallet.addPaymentMethod(bankAccount1);
        digitalWallet.addPaymentMethod(bankAccount2);

//        Deposit Funds
        account1.deposit(new BigDecimal("10000.00"));
        account2.deposit(new BigDecimal("4000.00"));
        account3.deposit(new BigDecimal("100.00"));

//        Transfer Fund
        digitalWallet.transferFund(account1, account2, new BigDecimal("100.00"), Currency.USD);
        digitalWallet.transferFund(account3, account1, new BigDecimal("10.35"), Currency.EUR);

//        Get transaction history
        List<Transaction> transactionHistory1_list = digitalWallet.getTransactionHistory(account1);
        List<Transaction> transactionHistory2_list = digitalWallet.getTransactionHistory(account2);
        List<Transaction> transactionHistory3_list = digitalWallet.getTransactionHistory(account3);

        System.out.println("\n------------------- Transaction History-1 For Account-1 -------------------");
        displayTransactionHistory(transactionHistory1_list);
        System.out.println("\n------------------- Transaction History-2 For Account-2 -------------------");
        displayTransactionHistory(transactionHistory2_list);
        System.out.println("\n------------------- Transaction History-3 For Account-3 -------------------");
        displayTransactionHistory(transactionHistory3_list);
    }

    private static void displayTransactionHistory(List<Transaction> transactionHistory_List){
        for (Transaction transaction:transactionHistory_List){
            System.out.println("TransactionID: "+transaction.getTransactionID());
            System.out.println("Amount: "+transaction.getAmount()+" "+transaction.getCurrency());
            System.out.println("TimeStamp: "+transaction.getTimeStamp());
            System.out.println();
        }
    }
}
