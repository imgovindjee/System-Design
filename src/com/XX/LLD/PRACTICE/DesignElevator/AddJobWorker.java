package com.XX.LLD.PRACTICE.DesignElevator;

import com.XX.LLD.PRACTICE.DesignElevator.Request.Request;

public class AddJobWorker implements Runnable{

    private Elevator elevator;
    private Request request;

    public AddJobWorker(Elevator elevator, Request request) {
        this.elevator = elevator;
        this.request = request;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(189);
        } catch (InterruptedException e){
            e.printStackTrace();
//            BUSINESS LOGIC FOR HANDLE THE ERROR
//            HERE
        }
        elevator.addJob(request);
    }
}
