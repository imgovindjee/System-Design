package com.XX.LLD.PRACTICE.DesignElevator.Request;

import com.XX.LLD.PRACTICE.DesignElevator.Enum.Direction;

public class ExternalRequest {

    private Direction directionToGo;
    private int sourceFloor;

    public ExternalRequest(Direction directionToGo, int sourceFloor) {
        this.directionToGo = directionToGo;
        this.sourceFloor = sourceFloor;
    }

    public Direction getDirectionToGO() {
        return directionToGo;
    }

    public void setDirectionToGo(Direction directionToGo) {
        this.directionToGo = directionToGo;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }

    @Override
    public String toString() {
        return " The Elevator has been requested on floor - " + sourceFloor +
                " and the person wants go in the - " + directionToGo;
    }
}
