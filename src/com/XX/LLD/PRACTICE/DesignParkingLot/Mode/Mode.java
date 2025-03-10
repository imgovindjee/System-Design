package com.XX.LLD.PRACTICE.DesignParkingLot.Mode;

import com.XX.LLD.PRACTICE.DesignParkingLot.Command.CommandExecutor;
import com.XX.LLD.PRACTICE.DesignParkingLot.Command.CommandExecutorFactory;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidCommandException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;

import java.io.IOException;

public abstract class Mode {

    private CommandExecutorFactory commandExecutorFactory;
    protected OutputPrinter outputPrinter;

    /**
     *
     * @param commandExecutorFactory
     * @param outputPrinter
     */
//    CONSTRUCTOR
    public Mode(CommandExecutorFactory commandExecutorFactory, OutputPrinter outputPrinter) {
        this.commandExecutorFactory = commandExecutorFactory;
        this.outputPrinter = outputPrinter;
    }

    /**
     *
     * Helper method to process a command,
     * It basically uses {@link CommandExecutor} to run the given command
     * @param command "COMMAND TO BE PROCESSED"
     */
    protected void processCommand(Command command){
        CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);
        if(commandExecutor.validate(command)){
            commandExecutor.execute(command);
        } else {
            throw new InvalidCommandException();
        }
    }

    /**
     *
     * Abstract METHOD TO PROCESS THE MODE. EACH MODE WILL PROCESS IN ITS OWN WAY
     * @throws IOException
     */
    public abstract void process() throws IOException;
}
