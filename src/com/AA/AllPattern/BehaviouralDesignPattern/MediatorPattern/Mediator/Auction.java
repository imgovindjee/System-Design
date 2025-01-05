package com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Mediator;

import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> bidder_list = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidder_list.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague bl:bidder_list){
            if(!bl.getName().equals(bidder.getName())) {
                bl.receiveBidNotification(bidAmount);
            }
        }
    }
}
