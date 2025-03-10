package com.O.CommandDesignPattern.CommandDesign.Command;

import com.O.CommandDesignPattern.CommandDesign.Reciver.AirConditioner;

public class TurnOffACCommand implements ICommand{
    AirConditioner airConditioner;

//    CONSTRUCTOR
    public TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }

    @Override
    public void undo() {
        System.out.println("--------------------UNDO-----------------------");
        airConditioner.turnOnAC();
    }
}
