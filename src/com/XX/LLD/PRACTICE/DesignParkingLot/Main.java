package com.XX.LLD.PRACTICE.DesignParkingLot;

import com.XX.LLD.PRACTICE.DesignParkingLot.Command.CommandExecutorFactory;
import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidModeException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Mode.FileMode;
import com.XX.LLD.PRACTICE.DesignParkingLot.Mode.InteractiveMode;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;
import com.XX.LLD.PRACTICE.DesignParkingLot.Test.TestMain;

import java.io.IOException;

public class Main {

    /**
     * CHECK WHETHER THE PROGRAM IS RUNNING USING FILE INPUT MODE
     *
     * @param args COMMAND LINE ARGUMENTS
     * @return boolean INDICATING WHETHER IN FILE INPUT MODE
     */
    private static boolean isFileMode(String[] args){
        return args.length == 1;
    }

    /**
     * CHECK WHETHER THE PROGRAM IS RUNNING USING INTERACTIVE SHELL MODE
     *
     * @param args "COMMAND LINE ARGUMENTS"
     * @return Boolean INDICATING WHETHER IN INTERACTIVE SHELL MODE.
     */
    private static boolean isInteractiveMode(String[] args){
        return args.length == 0;
    }


    public static void main(String[] args) throws IOException {
        OutputPrinter outputPrinter = new OutputPrinter();
        ParkingLotService parkingLotService = new ParkingLotService();
        CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory(parkingLotService);

        if (isInteractiveMode(args)) {
            new InteractiveMode(commandExecutorFactory, outputPrinter).process();
        } else if (isFileMode(args)) {
            new FileMode(commandExecutorFactory, outputPrinter, args[0]).process();
        } else {
            throw new InvalidModeException();
        }
    }
}
