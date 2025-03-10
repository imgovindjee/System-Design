package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

import java.util.List;
import java.util.stream.Collectors;

public class ColorToSlotNumberCommandExecution extends CommandExecutor{

    public ColorToSlotNumberCommandExecution(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "SLOT_NUMBERS_FOR_CAR_WITH_COLOR";
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
        List<Slot> slotsForColor = parkingLotService.getSlotForColor(command.getParams().get(0));
        if(slotsForColor.isEmpty()){
            outputPrinter.notFound();
        } else {
            String res = slotsForColor.stream()
                    .map(slot -> slot.getSlotNumber()+"")
                    .collect(Collectors.joining(", "));
            outputPrinter.printWithNewLine(res);
        }
    }
}
