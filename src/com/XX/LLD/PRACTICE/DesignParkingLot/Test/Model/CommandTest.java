package com.XX.LLD.PRACTICE.DesignParkingLot.Test.Model;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidCommandException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Model.Command;
import com.XX.LLD.PRACTICE.DesignParkingLot.OutputPrinter;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandTest {

    /**
     * HELPER METHOD IN VALIDATE COMMAND PARSING
     *
     * @param input  "INPUT LINE"
     * @param expectedCommandName    "EXPECTED COMMAND-NAME FROM I/P"
     * @param expectedParams     "EXPECTED COMMAND-PARAMS FROM I/P"
     */
    private void validateCommandParsing(String input, String expectedCommandName, List expectedParams){
        Command command = new Command(input);
        if(command != null){
            new OutputPrinter().printWithNewLine("\n--------------------------------------------------------------\n" +
                    "Command:- ");
            if(expectedCommandName.equals(command.getCommandName())){
                new OutputPrinter().printWithNewLine("Command Name is: "+expectedCommandName);
            }
            if(expectedParams.equals(command.getParams())){
                new OutputPrinter().printWithNewLine("Params also Equal" +
                        "\n-----------------------------------------------------------------------");
            }
        }
    }

    @Test
    public void testCommandParsingFromInput() {
        validateCommandParsing("my_command 1 2 3", "my command", Arrays.asList("1", "2", "3"));
        validateCommandParsing("my_command   1  2 ", "my_command", Arrays.asList("1", "2"));
        validateCommandParsing("my_command", "my_command", Collections.emptyList());
        validateCommandParsing("  my_command     ", "my_command", Collections.emptyList());
    }

    @Test(expected = InvalidCommandException.class)
    public void testCommandParsingFromInputHavingOnlySpaces(){
        Command command = new Command("   ");
    }

    @Test(expected = InvalidCommandException.class)
    public void testCommandParsingFromEmptyInput(){
        Command command = new Command("   ");
    }
}
