package com.XX.LLD.PRACTICE.DesignDigitalWallet.Wallet;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Account;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.CurrencyConverter;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.PaymentMethod;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Transaction;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class DigitalWallet {

    private static DigitalWallet digitalWallet;
    private Map<String, User> userMap;
    private Map<String, Account> accountMap;
    private Map<String , PaymentMethod> paymentMethodMap;

    private DigitalWallet(){
        this.accountMap = new ConcurrentHashMap<>();
        this.paymentMethodMap = new ConcurrentHashMap<>();
        this.userMap = new ConcurrentHashMap<>();
    }

    public static synchronized DigitalWallet getInstance(){
        if(digitalWallet == null){
            digitalWallet = new DigitalWallet();
        }
        return digitalWallet;
    }

    public void createUser(User user){
        userMap.put(user.getUserID(), user);
    }

    public User getUser(String userID){
        return userMap.get(userID);
    }

    public void createAccount(Account account){
        accountMap.put(account.getAccountID(), account);
        account.getUser().addAccount(account);
    }

    public Account getAccount(String accountID){
        return accountMap.get(accountID);
    }

    public synchronized void addPaymentMethod(PaymentMethod paymentMethod){
        paymentMethodMap.put(paymentMethod.getPaymentID(), paymentMethod);
    }

    public PaymentMethod getPaymentMethod(String paymentID){
        return paymentMethodMap.get(paymentID);
    }

    public synchronized void transferFund(Account sourceAccount, Account destinationAccount, BigDecimal amount, Currency currency){
        if (!sourceAccount.getCurrency().equals(currency)){
            amount = CurrencyConverter.convert(amount, currency, sourceAccount.getCurrency());
        }
        sourceAccount.withdraw(amount);

        if (!destinationAccount.getCurrency().equals(currency)){
            amount = CurrencyConverter.convert(amount, currency, destinationAccount.getCurrency());
        }
        destinationAccount.deposit(amount);

        String transactionID = generateTransactionID();
        Transaction transaction = new Transaction(transactionID, sourceAccount, destinationAccount, amount, currency);
        sourceAccount.addTransaction(transaction);
        destinationAccount.addTransaction(transaction);
    }

    public List<Transaction> getTransactionHistory(Account account){
        return account.getTransactionList();
    }

    private String generateTransactionID(){
        return "TXN-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
