package com.Q.MediatorDesignPattern.OnlineAuctionSystem.Mediator;

import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague.Colleague;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Colleague bidder, int bidAmount);
}
