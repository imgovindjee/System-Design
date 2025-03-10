package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingLot;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.ParkingStrategy.ParkingStrategyImplementation;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;
import com.XX.LLD.PRACTICE.DesignParkingLot.Validator.IntegerValidator;

import java.util.List;

public class CreateParkingLotCommandExecutor extends CommandExecutor{

    public CreateParkingLotCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "CREATE_PARKING_LOT";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Command command) {
        List<String> params = command.getParams();
        return params.size() == 1 && new IntegerValidator().isInteger(params.get(0));
    }

    /**
        * @inheritDoc
     */
    @Override
    public void execute(Command command) {
//        CAPACITY OF PARKING LOT
        int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
//        INSTANCE OF PARKING LOT
//        AND CREATING THE PARKING LOT
        ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
        parkingLotService.createParkingLot(parkingLot, new ParkingStrategyImplementation());
        outputPrinter.printWithNewLine(
                "Created a parking lot with "+parkingLot.getCapacity()+ " slots");
    }
}
