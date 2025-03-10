package com.XX.LLD.PRACTICE.DesignParkingLot.Command;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidCommandException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import com.XX.LLD.PRACTICE.DesignParkingLot.Service.ParkingLotService;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {

    private Map<String, CommandExecutor> commands = new HashMap<>();

    /**
     * Factory to get correct {@link CommandExecutor} from a given command.
     */
    public CommandExecutorFactory(ParkingLotService parkingLotService){
        OutputPrinter outputPrinter = new OutputPrinter();

        CreateParkingLotCommandExecutor createParkingLotCommandExecutor = new CreateParkingLotCommandExecutor(parkingLotService, outputPrinter);
        ParkCommandExecutor parkCommandExecutor = new ParkCommandExecutor(parkingLotService, outputPrinter);
        LeaveCommandExecutor leaveCommandExecutor = new LeaveCommandExecutor(parkingLotService, outputPrinter);
        StatusCommandExecutor statusCommandExecutor = new StatusCommandExecutor(parkingLotService, outputPrinter);
        ColorToRegistrationNumberCommandExecutor colorToRegistrationNumberCommandExecutor = new ColorToRegistrationNumberCommandExecutor(parkingLotService, outputPrinter);
        ColorToSlotNumberCommandExecution colorToSlotNumberCommandExecution = new ColorToSlotNumberCommandExecution(parkingLotService, outputPrinter);
        SlotForRegistrationNumberCommandExecutor slotForRegistrationNumberCommandExecutor = new SlotForRegistrationNumberCommandExecutor(parkingLotService, outputPrinter);
        ExitCommandExecutor exitCommandExecutor = new ExitCommandExecutor(parkingLotService, outputPrinter);

        commands.put(createParkingLotCommandExecutor.getCommandName(), createParkingLotCommandExecutor);
        commands.put(parkCommandExecutor.getCommandName(), parkCommandExecutor);
        commands.put(leaveCommandExecutor.getCommandName(), leaveCommandExecutor);
        commands.put(statusCommandExecutor.getCommandName(), statusCommandExecutor);
        commands.put(colorToRegistrationNumberCommandExecutor.getCommandName(), colorToRegistrationNumberCommandExecutor);
        commands.put(colorToSlotNumberCommandExecution.getCommandName(), colorToSlotNumberCommandExecution);
        commands.put(slotForRegistrationNumberCommandExecutor.getCommandName(), slotForRegistrationNumberCommandExecutor);
        commands.put(exitCommandExecutor.getCommandName(), exitCommandExecutor);
    }

    /**
     * Gets {@link CommandExecutor} for a particular command. It basically uses name of command to
     * fetch its corresponding executor.
     *
     * @param command Command for which executor has to be fetched.
     * @return Command executor.
     */
    public CommandExecutor getCommandExecutor(Command command){
        CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if(commandExecutor == null){
            throw new InvalidCommandException();
        }
        return commandExecutor;
    }
}
