package com.Q.MediatorDesignPattern.OnlineAuctionSystem;

import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague.Bidder;
import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Colleague.Colleague;
import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Mediator.Auction;
import com.Q.MediatorDesignPattern.OnlineAuctionSystem.Mediator.AuctionMediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1_colleague = new Bidder("A", auctionMediator);
        Colleague bidder2_colleague = new Bidder("B", auctionMediator);
        Colleague bidder3_colleague = new Bidder("C", auctionMediator);

        System.out.println("-----------------------------------------------------------------------------------------");
        bidder1_colleague.placeBid(100000);
        System.out.println("-----------------------------------------------------------------------------------------");
        bidder2_colleague.placeBid(120000);
        System.out.println("-----------------------------------------------------------------------------------------");
        bidder1_colleague.placeBid(140000);
        System.out.println("-----------------------------------------------------------------------------------------");
//        bidder3_colleague.placeBid(160000);
//        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
