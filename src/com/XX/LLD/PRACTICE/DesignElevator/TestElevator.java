package com.XX.LLD.PRACTICE.DesignElevator;

import com.XX.LLD.PRACTICE.DesignElevator.Enum.Direction;
import com.XX.LLD.PRACTICE.DesignElevator.Request.ExternalRequest;
import com.XX.LLD.PRACTICE.DesignElevator.Request.InternalRequest;
import com.XX.LLD.PRACTICE.DesignElevator.Request.Request;

public class TestElevator {
    public static void main(String[] args){
        Elevator elevator = new Elevator();

//        InternalRequest internalRequest = new InternalRequest(5);
//        ExternalRequest externalRequest = new ExternalRequest(Direction.UP, 0);
//        Request request = new Request(internalRequest, externalRequest);

        InternalRequest internalRequest = new InternalRequest(0);
        ExternalRequest externalRequest = new ExternalRequest(Direction.DOWN, 4);
        Request request = new Request(internalRequest, externalRequest);


        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        new Thread(processJobWorker).start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
//            TO-DO HANDLE EXCEPTION
            e.printStackTrace();
        }


        new Thread(new AddJobWorker(elevator, request)).start();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
//            TO-DO HANDLE EXCEPTION
            e.printStackTrace();
        }
    }
}
