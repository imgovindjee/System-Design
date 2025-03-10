package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

import java.util.List;
import java.util.stream.Collectors;

public class ColorToRegistrationNumberCommandExecutor extends CommandExecutor{

    public ColorToRegistrationNumberCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "REGISTRATION_NUMBER_FOR_CARS_WITH_COLOR";
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 1;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void execute(Command command) {
        List<Slot> slotForColor = parkingLotService.getSlotForColor(command.getParams().get(0));
        if(slotForColor.isEmpty()){
            outputPrinter.notFound();
        } else {
            String msg = slotForColor.stream()
                            .map(slot -> slot.getParkedCar().getRegistrationNumber())
                                    .collect(Collectors.joining(", "));
            outputPrinter.printWithNewLine(msg);
        }
    }
}
