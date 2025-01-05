package com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Invoker;

import com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.EG1.Command.ICommand;

import java.util.Stack;

public class MyRemoteControl {
    Stack<ICommand> airConditioner_commandHistory = new Stack<>();
    ICommand iCommand;

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
