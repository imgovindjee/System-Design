package com.XX.LLD.PRACTICE.DesignParkingLot.Mode;

import com.XX.LLD.PRACTICE.DesignParkingLot.Command.CommandExecutorFactory;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;

import java.io.*;

public class FileMode extends Mode{

    private String fileName;

    /**
     * @param commandExecutorFactory
     * @param outputPrinter
     */
    public FileMode(CommandExecutorFactory commandExecutorFactory, OutputPrinter outputPrinter, String fileName) {
        super(commandExecutorFactory, outputPrinter);
        this.fileName = fileName;
    }

    /**
     *
     * {@inheritDoc}
     * @throws IOException
     */
    @Override
    public void process() throws IOException {
        File file = new File(fileName);
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e){
            outputPrinter.invalidFile();
            return;
        }

        String input = reader.readLine();
        while (input != null){
            Command command = new Command(input);
            processCommand(command);
            input = reader.readLine();
        }
    }
}
