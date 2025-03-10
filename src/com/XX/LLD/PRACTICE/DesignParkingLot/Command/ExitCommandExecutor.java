package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

public class ExitCommandExecutor extends CommandExecutor{

    public ExitCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "EXIT";
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean validate(Command command) {
        return command.getParams().isEmpty();
    }

    /**
     * @inheritDoc
     */
    @Override
    public void execute(Command command) {
        outputPrinter.end();
    }
}
