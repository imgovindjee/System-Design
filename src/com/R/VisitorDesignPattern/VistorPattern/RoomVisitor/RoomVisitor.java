package com.R.VisitorDesignPattern.VistorPattern.RoomVisitor;

import com.R.VisitorDesignPattern.VistorPattern.RoomType.DeluxeRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.DoubleRoom;
import com.R.VisitorDesignPattern.VistorPattern.RoomType.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomVisitor);
    public void visit(DeluxeRoom deluxeRoomVisitor);
    public void visit(DoubleRoom doubleRoomVisitor);
}
