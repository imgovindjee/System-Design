package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

import java.util.List;
import java.util.Optional;

public class SlotForRegistrationNumberCommandExecutor extends CommandExecutor{

    public SlotForRegistrationNumberCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "SLOT_NUMBER_FOR_REGISTRATION_NUMBER";
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
        List<Slot> occupiedSlot = parkingLotService.getOccupiedSlots();
        String registrationNumber = command.getParams().get(0);
        Optional<Slot> foundSlot = occupiedSlot.stream()
                .filter(slot -> slot.getParkedCar().getRegistrationNumber().equals(registrationNumber))
                .findFirst();
        if(foundSlot.isPresent()){
            outputPrinter.printWithNewLine(""+foundSlot.get().getSlotNumber());
        } else {
            outputPrinter.notFound();
        }
    }
}
