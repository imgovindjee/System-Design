package com.R.VisitorDesignPattern.VistorPattern.RoomVisitor;

import com.R.VisitorDesignPattern.VistorPattern.RoomType.DeluxeRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.DoubleRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.SingleRoom;

public class RoomPriceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomVisitor) {
        System.out.println("------------------------------------------------------------------------------------" +
                "\nComputing the price of SingleRoom");
        singleRoomVisitor.roomPrice = 1000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomVisitor) {
        System.out.println("-------------------------------------------------------------------------------------" +
                "\nComputing the price of DeluxeRoom");
        deluxeRoomVisitor.roomPrice = 3500;
    }

    @Override
    public void visit(DoubleRoom doubleRoomVisitor) {
        System.out.println("-------------------------------------------------------------------------------------" +
                "\nComputing the price of DoubleRoom");
        doubleRoomVisitor.roomPrice = 1850;
    }
}
