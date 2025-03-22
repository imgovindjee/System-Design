package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Account;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Stock;

public class SellOrder extends Order{

    public SellOrder(String orderID, Account account, Stock stock, int quantity, double price) {
        super(orderID, account, stock, quantity, price);
    }

    @Override
    public void execute() {
//        Check if user has sufficient quantity of stock to sell
//        Update portfolio and perform necessary actions
        double totalProceeds = quantity * price;
        account.deposit(totalProceeds);
        orderStatus = OrderStatus.EXECUTED;
    }
}
