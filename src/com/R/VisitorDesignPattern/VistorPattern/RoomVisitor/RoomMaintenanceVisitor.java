package com.R.VisitorDesignPattern.VistorPattern.RoomVisitor;

import com.R.VisitorDesignPattern.VistorPattern.RoomType.DeluxeRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.DoubleRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.SingleRoom;

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
