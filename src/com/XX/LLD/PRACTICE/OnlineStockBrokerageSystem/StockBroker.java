package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Exceptions.InsufficientFundExceptions;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Exceptions.InsufficientStockExceptions;
import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Oder.Order;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class StockBroker {

    private static StockBroker stockBroker;
    private Map<String, Account> accountMap;
    private Map<String, Stock> stockMap;
    private Queue<Order> orderQueue;
    private AtomicInteger atomicInteger;

    private StockBroker(){
        this.accountMap = new ConcurrentHashMap<>();
        this.stockMap = new ConcurrentHashMap<>();
        this.atomicInteger = new AtomicInteger();
        this.orderQueue = new ConcurrentLinkedDeque<>();
    }

    public static synchronized StockBroker getInstance(){
        if (stockBroker == null) {
            stockBroker = new StockBroker();
        }
        return stockBroker;
    }

    public void createAccount(User user, double initial_balance){
        String accountID = generateAccountID();
        Account account = new Account(accountID, user, initial_balance);
        accountMap.put(accountID, account);
    }

    public Account getAccount(String accountID){
        return accountMap.get(accountID);
    }

    public void addStock(Stock stock){
        stockMap.put(stock.getSymbol(), stock);
    }

    public Stock getStock(String stockSymbol){
        return stockMap.get(stockSymbol);
    }

    public void placeOrder(Order order){
        orderQueue.offer(order);
        processOrder();
    }

    private String generateAccountID(){
        int accountID = atomicInteger.getAndIncrement();
        return "A"+String.format("%03d", accountID);
    }

    private void processOrder(){
        while (!orderQueue.isEmpty()){
            Order order = orderQueue.poll();
            try {
                order.execute();
            } catch (InsufficientStockExceptions | InsufficientFundExceptions e){
                System.out.println("\nOrder Failed: "+e.getMessage());
            }
        }
    }
}
