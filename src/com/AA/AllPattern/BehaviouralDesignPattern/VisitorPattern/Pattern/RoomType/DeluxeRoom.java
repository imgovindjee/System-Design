package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType;

import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor.RoomVisitor;

public class DeluxeRoom implements RoomElement{
    public int roomPrice = 0;

    @Override
    public void acceptRoom(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
