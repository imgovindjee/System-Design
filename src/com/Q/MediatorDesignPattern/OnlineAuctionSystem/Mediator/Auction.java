package com.Q.MediatorDesignPattern.OnlineAuctionSystem.Mediator;

import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagueList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague cl:colleagueList) {
            if(!cl.getName().equals(bidder.getName())) {
                cl.receiveBidNotification(bidAmount);
            }
        }
    }
}
