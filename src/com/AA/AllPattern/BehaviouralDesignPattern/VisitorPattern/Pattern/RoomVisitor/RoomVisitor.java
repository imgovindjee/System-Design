package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor;

import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DeluxeRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.DoubleRoom;
import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomVisitor);
    public void visit(DeluxeRoom deluxeRoomVisitor);
    public void visit(DoubleRoom doubleRoomVisitor);
}
