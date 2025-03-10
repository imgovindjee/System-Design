package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor;

import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DeluxeRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DoubleRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomVisitor) {
        System.out.println("----------------------------------------------------------------------" +
                "\nMaintenance done for SingleRoom");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomVisitor) {
        System.out.println("------------------------------------------------------------------------" +
                "\nMaintenance done for DeluxeRoom");
    }

    @Override
    public void visit(DoubleRoom doubleRoomVisitor) {
        System.out.println("-------------------------------------------------------------------------" +
                "\nMaintenance done for DoubleRoom");
    }
}
