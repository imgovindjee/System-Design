package com.R.VisitorDesignPattern.VistorPattern;

import com.R.VisitorDesignPattern.VistorPattern.RoomType.DeluxeRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.DoubleRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.RoomElement;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.SingleRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomVisitor.RoomMaintenanceVisitor;
import com.R.VisitorDesignPattern.VistorPattern.RoomVisitor.RoomPriceVisitor;
import com.R.VisitorDesignPattern.VistorPattern.RoomVisitor.RoomVisitor;

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
