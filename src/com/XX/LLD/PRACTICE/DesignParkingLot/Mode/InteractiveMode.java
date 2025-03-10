package com.XX.LLD.PRACTICE.DesignParkingLot.Mode;

import com.XX.LLD.PRACTICE.DesignParkingLot.Command.CommandExecutorFactory;
import com.XX.LLD.PRACTICE.DesignParkingLot.Command.ExitCommandExecutor;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveMode extends Mode{

    /**
     * @param commandExecutorFactory
     * @param outputPrinter
     */
    public InteractiveMode(CommandExecutorFactory commandExecutorFactory, OutputPrinter outputPrinter) {
        super(commandExecutorFactory, outputPrinter);
    }

    /**
     *
     * {@inheritDoc}
     * @throws IOException
     */
    @Override
    public void process() throws IOException {
        outputPrinter.welcome();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String inputLine = reader.readLine();
            Command command = new Command(inputLine);
            processCommand(command);
            if(command.getCommandName().equals(new ExitCommandExecutor(null, null).getCommandName())){
                break;
            }
        }
    }
}
