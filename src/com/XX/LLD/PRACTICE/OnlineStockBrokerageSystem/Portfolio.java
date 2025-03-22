package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Exceptions.InsufficientStockExceptions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Portfolio {

    private Account account;
    private Map<String, Integer> holdings;

    public Portfolio(Account account){
        this.account = account;
        this.holdings = new ConcurrentHashMap<>();
    }

    public synchronized void addStocks(Stock stock, int quantity){
        holdings.put(stock.getSymbol(), holdings.getOrDefault(stock.getSymbol(), 0)+quantity);
    }

    public synchronized Map<String, Integer> getHoldings() {
        return holdings;
    }

    public synchronized void removeStocks(Stock stock, int quantity){
        String symbol = stock.getSymbol();
        if (holdings.containsKey(symbol)){
            int currentQuantity = holdings.get(symbol);
            if (currentQuantity > quantity){
                holdings.put(symbol, currentQuantity-quantity);
            } else if(currentQuantity == quantity){
                holdings.remove(symbol);
            } else {
                throw new InsufficientStockExceptions("Insufficient stock quantity in the portfolio");
            }
        } else {
            throw new InsufficientStockExceptions("Stock not found in the portfolio");
        }
    }
}
