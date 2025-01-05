package com.XX.LLD.PRACTICE.DesignParkingLot.Model;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidCommandException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Command {

    private String commandName;
    private List<String> params;

    /**
     * Constructor. It takes the input line and parses the command name and param out of it. If the
     * command or its given params are not valid, then {@link InvalidCommandException} is thrown.
     *
     * @param inputLine Given input command line.
     */
    public Command(String inputLine){
        List<String> tokenList = Arrays.stream(inputLine.trim()
                        .split(" "))
                        .map(String::trim)
                        .filter(token -> (token.length() > 0))
                        .collect(Collectors.toList());
        if (tokenList.size() == 0) {
            throw new InvalidCommandException();
        }
        commandName = tokenList.get(0).toLowerCase();
        tokenList.remove(0);
        params = tokenList;
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams() {
        return params;
    }
}
