package com.R.VisitorDesignPattern.VistorPattern.RoomType;

import com.R.VisitorDesignPattern.VistorPattern.RoomVisitor.RoomVisitor;

public class DoubleRoom implements RoomElement {
    public int roomPrice = 0;
    @Override
    public void acceptRoom(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
