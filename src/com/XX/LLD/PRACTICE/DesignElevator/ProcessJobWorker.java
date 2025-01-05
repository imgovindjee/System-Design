package com.XX.LLD.PRACTICE.DesignElevator;

public class ProcessJobWorker implements Runnable{

    private final Elevator elevator;

    public ProcessJobWorker(Elevator elevator){
        this.elevator = elevator;
    }

    @Override
    public void run() {
//        START THE ELEVATOR
        elevator.startElevator();
    }
}
