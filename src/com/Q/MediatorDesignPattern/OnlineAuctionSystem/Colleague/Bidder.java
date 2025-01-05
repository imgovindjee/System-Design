package com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague;


import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Mediator.AuctionMediator;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;

//    CONSTRUCTOR
    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: "+name+" gets the notification that someone has put bid of: "+bidAmount);
    }
}
