package com.XX.LLD.PRACTICE.DesignElevator;

import com.XX.LLD.PRACTICE.DesignElevator.Enum.Direction;
import com.XX.LLD.PRACTICE.DesignElevator.Enum.State;
import com.XX.LLD.PRACTICE.DesignElevator.Request.Request;

import java.util.TreeSet;

public class Elevator {

    private int currentFloor = 0;
    private Direction currentDirection = Direction.UP;
    private State currentState = State.IDLE;
//    JOBS WHICH ARE BEING PROCESSED
    private TreeSet<Request> currentJobs = new TreeSet<>();
//    UP-JOBS WHICH CAN'T BE PROCESSED NOW SO PUT IT IN PENDING QUEUE
    private TreeSet<Request> upPendingJobs = new TreeSet<>();
//    DOWN-JOBS WHICH CAN'T BE PROCESSED NOW SO PUT IT IN PENDING QUEUE
    private TreeSet<Request> downPendingJobs = new TreeSet<>();


//    START THE ELEVATOR
    public void startElevator(){
        System.out.println("----------------------------------------------------------------------------------------\n" +
                "ELEVATOR HAS START WORKING\n" +
                "----------------------------------------------------------------------------------------------------");
        while (true){
            if(checkIfJob()){
//                UP JOBS
                if(currentDirection == Direction.UP){
                    Request request = currentJobs.pollFirst();
                    processUpRequest(request);
                    if(currentJobs.isEmpty()){
                        addPendingDownJobsToCurrentJobs();
                    }
                }

//                DOWN JOBS
                if(currentDirection == Direction.DOWN){
                    Request request = currentJobs.pollLast();
                    processDownRequest(request);
                    if(currentJobs.isEmpty()) {
                        addPendingUpJobsToCurrentJobs();
                    }
                }
            }
        }
    }

    private boolean checkIfJob(){
        return !currentJobs.isEmpty();
    }

    private void processUpRequest(Request request){
//        THE ELEVATOR ISN'T ON THE FLOOR WHERE THE PERSON HAS REQUESTED IT
//        .i.e. SOURCE FLOOR
//        SO FIRST BRING THE ELEVATOR THEIR
        int startFloor = currentFloor;
        if(startFloor < request.getExternalRequest().getSourceFloor()) {
            for( int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
//                    BUSINESS LOGIC FOR HANDLE THE ERROR
//                    HERE
                }
                System.out.println("We Have Reached the Floor -- "+i);
                currentFloor = i;
            }
        }
//       HERE THE ELEVATOR REACHES THE SOURCE FLOOR
        System.out.println("Reached the Source Floor -- OPENING DOOR.");

        startFloor = currentFloor;
        for( int i = startFloor + 1; i <= request.getInternalRequest().getDestinationFloor(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
//                BUSINESS LOGIC FOR HANDLE THE ERROR
//                HERE
            }

            System.out.println("We Have reached floor -- "+ i);
            currentFloor = i;
            if(checkIfNewJobCanBeProcessed(request)){
                break;
            }
        }
    }

    private void processDownRequest(Request request) {
//        THE ELEVATOR ISN'T ON THE FLOOR WHERE THE PERSON HAS REQUESTED IT
//        .i.e. SOURCE FLOOR
//        SO FIRST BRING THE ELEVATOR THEIR
        int startFloor = currentFloor;
        if(startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
//                    BUSINESS LOGIC FOR HANDLE THE ERROR
//                    HERE
                }
                System.out.println("We have Reached floor -- " + i);
                currentFloor = i;
            }
        }
//        HERE THE ELEVATOR REACHES THE SOURCE FLOOR
        System.out.println("Reached the Source Floor -- OPENING DOOR.");

        startFloor = currentFloor;
        for(int i = startFloor - 1; i >= request.getInternalRequest().getDestinationFloor(); i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                    BUSINESS LOGIC FOR HANDLE THE ERROR
//                    HERE
            }
            System.out.println("You have reached floor -- "+i);
            currentFloor = i;
            if(checkIfNewJobCanBeProcessed(request)){
                break;
            }
        }
    }

    private boolean checkIfNewJobCanBeProcessed(Request currentRequest) {
        if(checkIfJob()) {
//            FOR UP - JOBS
            if(currentDirection == Direction.UP){
                Request request = currentJobs.pollLast();
                if(request.getInternalRequest().getDestinationFloor() < currentRequest.getInternalRequest().getDestinationFloor()){
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }

                currentJobs.add(request);
            }

//            FOR DOWN - JOBS
            if(currentDirection == Direction.DOWN) {
                Request request = currentJobs.pollFirst();
                if(request.getInternalRequest().getDestinationFloor() > currentRequest.getInternalRequest().getDestinationFloor()){
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }
                currentJobs.add(request);
            }
        }
        return false;
    }

    private void addPendingDownJobsToCurrentJobs(){
        if(!downPendingJobs.isEmpty()) {
            System.out.println("Pick a pending DOWN job and execute it by putting in current job");
            currentJobs = downPendingJobs;
            currentDirection = Direction.DOWN;
        } else {
            currentState = State.IDLE;
            System.out.println("The Elevator is in IDLE STATE");
        }
    }

    private void addPendingUpJobsToCurrentJobs(){
        if(!upPendingJobs.isEmpty()) {
            System.out.println("Pick a pending Up job and execute it by putting in current job");
            currentJobs = upPendingJobs;
            currentDirection = Direction.UP;
        } else {
            currentState = State.IDLE;
            System.out.println("The Elevator is in IDLE STATE");
        }
    }

    public void addJob(Request request){
        if(currentState == State.IDLE){
            if(currentFloor == request.getExternalRequest().getSourceFloor()){
                System.out.println("Adding current queue job -- lift state is - "+currentState+
                        " location is - "+ currentFloor + " to move  to floor - "+request.getInternalRequest().getDestinationFloor());
            } else {
                System.out.println("Adding current queue job -- lift state is - "+currentState+
                        " location is - "+ currentFloor + " to move  to floor - "+request.getExternalRequest().getSourceFloor());
            }
            currentState = State.MOVING;
            currentDirection = request.getExternalRequest().getDirectionToGO();
            currentJobs.add(request);
        } else if(currentState == State.MOVING){
            if(currentDirection != request.getExternalRequest().getDirectionToGO()) {
                addToPendingJobs(request);
            } else if(request.getExternalRequest().getDirectionToGO() == currentDirection){
                if(currentDirection == Direction.UP && request.getInternalRequest().getDestinationFloor() < currentFloor){
                    addToPendingJobs(request);
                } else if(currentDirection == Direction.DOWN && request.getInternalRequest().getDestinationFloor() > currentFloor){
                    addToPendingJobs(request);
                } else {
                    currentJobs.add(request);
                }
            }
        }
    }

    public void addToPendingJobs(Request request){
        if(request.getExternalRequest().getDirectionToGO() == Direction.UP){
            System.out.println("ADD TO PENDING UP JOBS");
            upPendingJobs.add(request);
        } else {
            System.out.println("ADD TO PENDING DOWN JOBS");
            downPendingJobs.add(request);
        }
    }
}
