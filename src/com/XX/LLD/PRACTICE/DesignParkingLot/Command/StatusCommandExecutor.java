package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Car;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Slot;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

import java.util.List;

public class StatusCommandExecutor extends CommandExecutor{

    public StatusCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "STATUS";
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
        List<Slot> occupiedSlot = parkingLotService.getOccupiedSlots();
        if(occupiedSlot.isEmpty()){
            outputPrinter.parkingLotEmpty();
            return;
        }

        outputPrinter.statusHeader();
        for (Slot oSlot:occupiedSlot){
            Car parkedCar = oSlot.getParkedCar();
            String slotNumber = ""+oSlot.getSlotNumber();
            outputPrinter.printWithNewLine(padString(slotNumber, 12)+ padString(parkedCar.getRegistrationNumber(), 19)+parkedCar.getCarColor());
        }
    }

    private String padString(String word, int length){
        StringBuilder newWord = new StringBuilder(word);
        return newWord.append(" ".repeat(Math.max(0, length - word.length())))
                .toString();
    }
}
