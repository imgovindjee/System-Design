package com.O.CommandDesignPattern.CommandDesign;

import com.O.CommandDesignPattern.CommandDesign.Command.TurnOffACCommand;
import com.O.CommandDesignPattern.CommandDesign.Command.TurnOnACCommand;
import com.O.CommandDesignPattern.CommandDesign.Invoker.MyRemoteControl;
import com.O.CommandDesignPattern.CommandDesign.Reciver.AirConditioner;

public class Main {
    public static void main(String[] args) {
//        AirConditioner
        AirConditioner airConditioner = new AirConditioner();

//        REMOTE CONTROL
        MyRemoteControl remoteControl = new MyRemoteControl();

//        command creation and setting up object
//        command-1
        remoteControl.setiCommand(new TurnOnACCommand(airConditioner));
        remoteControl.executeCommand();
//        command-2
//        remoteControl.setiCommand(new TurnOffACCommand(airConditioner));
//        remoteControl.executeCommand();

//        undo the latest command
        remoteControl.executeUndo();
    }
}
