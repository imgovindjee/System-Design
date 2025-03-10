package com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomType;

import com.AA.AllPattern.BehaviouralDesignPattern.VisitorPattern.Pattern.RoomVisitor.RoomVisitor;

public interface RoomElement {
    public void acceptRoom(RoomVisitor visitor);
}
