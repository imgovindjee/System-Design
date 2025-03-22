package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder.BuyOrder;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder.Order;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder.SellOrder;

public class StockBrokerageSystemImplementation {
    public static void run(){
//        stock broker instance
        StockBroker  stockBroker = StockBroker.getInstance();

//        Create User
        User user1 = new User("U001", "Priyanka", "priyanka@gmail.com");

//        Create Account
        stockBroker.createAccount(user1, 10000.9);
        Account account = stockBroker.getAccount("A001");

//        Add Stocks
        Stock stock1 = new Stock("AAPL", "Apple Inc.", 130.9);
        Stock stock2 = new Stock("A", "Alphabet Inc", 1550.12);
        Stock stock3 = new Stock("Nifty", "Nifty-50", 133.0);
        stockBroker.addStock(stock1);
        stockBroker.addStock(stock2);
        stockBroker.addStock(stock3);

//        Place Buy order
        Order order1 = new BuyOrder("O001", account, stock1, 10, 130.9);
        Order order2 = new BuyOrder("O002", account, stock2, 4, 1550.12);
        stockBroker.placeOrder(order1);
        stockBroker.placeOrder(order2);

//        Place sell Order
        Order sellOrder1 = new SellOrder("O003", account, stock1, 5, 140.0);
        stockBroker.placeOrder(sellOrder1);

//        Print the account balance
        System.out.println("Account balance: $"+account.getBalance());
        System.out.println("Portfolio: "+account.getPortfolio().getHoldings());
    }
}
