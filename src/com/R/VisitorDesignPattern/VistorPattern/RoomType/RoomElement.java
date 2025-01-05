package com.R.VisitorDesignPattern.VistorPattern.RoomType;

import com.R.VisitorDesignPattern.VistorPattern.RoomVisitor.RoomVisitor;

public interface RoomElement {
    public void acceptRoom(RoomVisitor visitor);
}
