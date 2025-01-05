package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.NoFreeSlotAvailableException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Car;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

public class ParkCommandExecutor extends CommandExecutor{

    public ParkCommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getCommandName() {
        return "PARK";
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 2;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void execute(Command command) {
        Car car = new Car(command.getParams().get(0), command.getParams().get(1));
        try{
            int slot = parkingLotService.park(car);
            outputPrinter.printWithNewLine("Car with registrationNumber: "+car.getRegistrationNumber()+", has Allocated slot Number: "+slot+" for CAR-PARKING");
        } catch (NoFreeSlotAvailableException e){
            outputPrinter.parkingLotFull();
        }
    }
}
