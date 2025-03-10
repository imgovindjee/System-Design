package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;
import com.XX.LLD.PRACTICE.DesignParkingLot.Validator.IntegerValidator;

import javax.xml.validation.Validator;
import java.util.List;

public class LeaveCommandExecutor extends CommandExecutor{

    public LeaveCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "LEAVE";
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean validate(Command command) {
        List<String> params = command.getParams();
        return params.size() != 1 ? false : new IntegerValidator().isInteger(params.get(0));
    }

    /**
     * @inheritDoc
     */
    @Override
    public void execute(Command command) {
        int slotNumber = Integer.parseInt(command.getParams().get(0));
        parkingLotService.makeSlotFree(slotNumber);
        outputPrinter.printWithNewLine("Slot number: "+slotNumber+" is free.");
    }
}
