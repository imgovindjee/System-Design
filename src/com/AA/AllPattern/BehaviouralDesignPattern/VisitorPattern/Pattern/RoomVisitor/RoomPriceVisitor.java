package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor;


import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DeluxeRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DoubleRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.SingleRoom;

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
