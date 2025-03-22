package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Account;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Stock;

public abstract class Order {

    protected String orderID;
    protected Account account;
    protected Stock stock;
    protected int quantity;
    protected double price;
    protected OrderStatus orderStatus;

    public Order(String orderID, Account account, Stock stock, int quantity, double price) {
        this.orderID = orderID;
        this.account = account;
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.orderStatus = OrderStatus.PENDING;
    }

    public abstract void execute();
}
