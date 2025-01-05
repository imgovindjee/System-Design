package com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Colleague;

public interface Colleague {
    public void placeBid(int bidAmount);
    public void receiveBidNotification(int bidAmount);
    public String getName();
}
