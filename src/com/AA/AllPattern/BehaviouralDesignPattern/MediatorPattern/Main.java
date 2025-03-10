package com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Colleague.Bidder;
import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Colleague.Colleague;
import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Mediator.Auction;
import com.AA.AllPattern.BehaviouralDesignPattern.MediatorPattern.Mediator.AuctionMediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1 = new Bidder("Q", auctionMediator);
        Colleague bidder2 = new Bidder("A", auctionMediator);
        Colleague bidder3 = new Bidder("W", auctionMediator);

        System.out.println("-----------------------------------------------------------------------------------------");
        bidder1.placeBid(100000);
        System.out.println("-----------------------------------------------------------------------------------------");
        bidder2.placeBid(140000);
        System.out.println("-----------------------------------------------------------------------------------------");
        bidder1.placeBid(150000);
        System.out.println("-----------------------------------------------------------------------------------------");
        bidder3.placeBid(300000);
    }
}
