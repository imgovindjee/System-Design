package com.O.CommandDesignPattern.CommandDesign.Invoker;

import com.O.CommandDesignPattern.CommandDesign.Command.ICommand;
import java.util.Stack;


public class MyRemoteControl {
    Stack<ICommand> airConditioner_commandHistory = new Stack<>();
    ICommand iCommand;

//    CONSTRUCTOR
    public MyRemoteControl(){}

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void executeCommand() {
        iCommand.execute();
        airConditioner_commandHistory.push(iCommand);
    }

    public void executeUndo() {
        if(!airConditioner_commandHistory.isEmpty()) {
            ICommand topOfStack_latestCommand = airConditioner_commandHistory.pop();
            topOfStack_latestCommand.undo();
        }
    }
}
