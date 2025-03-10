package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Account;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Exceptions.InsufficientFundExceptions;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Stock;

public class BuyOrder extends Order{

    public BuyOrder(String orderID, Account account, Stock stock, int quantity, double price) {
        super(orderID, account, stock, quantity, price);
    }

    @Override
    public void execute() {
        double totalCost = quantity * price;
        if (account.getBalance() >= totalCost){
            account.withdrawal(totalCost);
//            update the portfolio
            orderStatus = OrderStatus.EXECUTED;
        } else {
            orderStatus = OrderStatus.REJECTED;
            throw new InsufficientFundExceptions("Insufficient fund in the account");
        }
    }
}
