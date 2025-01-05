package com.XX.LLD.PRACTICE.DesignElevator;

import com.XX.LLD.PRACTICE.DesignElevator.Enum.Direction;
import com.XX.LLD.PRACTICE.DesignElevator.Request.ExternalRequest;
import com.XX.LLD.PRACTICE.DesignElevator.Request.InternalRequest;
import com.XX.LLD.PRACTICE.DesignElevator.Request.Request;

public class Main {
    public static void main(String[] args){
        Elevator elevator = new Elevator();

//        ExternalRequest externalRequest = new ExternalRequest(Direction.UP, 5);
//        InternalRequest internalRequest = new InternalRequest(0);

        ExternalRequest externalRequest = new ExternalRequest(Direction.DOWN, 5);
        InternalRequest internalRequest = new InternalRequest(0);

        Request request = new Request(internalRequest, externalRequest);
//        PASS JOB TO THE ELEVATOR
        new Thread(new AddJobWorker(elevator, request)).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
//            BUSINESS LOGIC FOR HANDLE ERROR
//            HERE
        }

//        THREAD FOR STARTING THE ELEVATOR
        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        new Thread(processJobWorker).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
//            BUSINESS LOGIC FOR HANDLE ERROR
//            HERE
        }
    }
}
