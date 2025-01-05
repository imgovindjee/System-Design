package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern;

import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DeluxeRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DoubleRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.RoomElement;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.SingleRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor.RoomMaintenanceVisitor;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor.RoomPriceVisitor;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomElement = new SingleRoom();
        RoomElement doubleRoomElement = new DoubleRoom();
        RoomElement deluxeRoomElement = new DeluxeRoom();

//        Performing the Operations
//        1. getting the RoomPrice
        RoomVisitor roomPriceVistor = new RoomPriceVisitor();

        singleRoomElement.acceptRoom(roomPriceVistor);
        System.out.println("Single Room Price: "+((SingleRoom)singleRoomElement).roomPrice);

        doubleRoomElement.acceptRoom(roomPriceVistor);
        System.out.println("Double Room Price is: "+((DoubleRoom)doubleRoomElement).roomPrice);

        deluxeRoomElement.acceptRoom(roomPriceVistor);
        System.out.println("Deluxe Room Price is: "+((DeluxeRoom)deluxeRoomElement).roomPrice);

//        2. getting the Maintenance
        RoomVisitor roomMaintenece = new RoomMaintenanceVisitor();
        singleRoomElement.acceptRoom(roomMaintenece);
        deluxeRoomElement.acceptRoom(roomMaintenece);
        doubleRoomElement.acceptRoom(roomMaintenece);
    }
}
