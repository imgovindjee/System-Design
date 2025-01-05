package com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague;

public interface Colleague {
    String getName();
    public void placeBid(int bidAmount);
    public void receiveBidNotification(int bidAmount);
}
