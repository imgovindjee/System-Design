package com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Command;

import com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Reciver.AirConditioner;

public class TurnOnACCommand implements ICommand{
    AirConditioner airConditioner;

//    CONSTRUCTOR
    public TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }

    @Override
    public void undo() {
        System.out.println("---------------------UNDO----------------------");
        airConditioner.turnOffAC();
    }
}
