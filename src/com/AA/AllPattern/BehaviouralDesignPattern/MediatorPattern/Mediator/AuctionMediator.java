package com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Mediator;

import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Colleague.Colleague;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Colleague bidder, int bidAmount);
}
