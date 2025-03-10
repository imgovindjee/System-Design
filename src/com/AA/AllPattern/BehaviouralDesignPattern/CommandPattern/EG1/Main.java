package com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1;

import com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Command.TurnOnACCommand;
import com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Invoker.MyRemoteControl;
import com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Reciver.AirConditioner;

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
