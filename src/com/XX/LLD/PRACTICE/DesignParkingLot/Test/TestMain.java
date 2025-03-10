package com.XX.LLD.PRACTICE.DesignParkingLot.Test;

import com.XX.LLD.PRACTICE.DesignParkingLot.Exception.InvalidModeException;
import com.XX.LLD.PRACTICE.DesignParkingLot.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class TestMain {

    private InputStream systemInBackUp;
    private PrintStream systemOutBackUp;
    private ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
//        BACK-UP {@System.IN} to restore it later
        systemInBackUp = System.in;
//        BACK-UP {@System.out} to restore it later
        systemOutBackUp = System.out;
        System.setOut(new PrintStream(outputContent));
    }

    @After
    public void tearDown() throws Exception{
        System.setIn(systemInBackUp);
        System.setOut(systemOutBackUp);
    }

    @Test
    public void testInteractiveMode() throws IOException {
        String commands = "create_parking_lot 6\r\n"
                        + "park KA-01-HH-1234 White\r\n"
                        + "park KA-01-HH-9999 White\r\n"
                        + "park KA-01-BB-0001 Black\r\n"
                        + "park KA-01-HH-7777 Red\r\n"
                        + "park KA-01-HH-2701 Blue\r\n"
                        + "park KA-01-HH-3141 Black\r\n"
                        + "leave 4\r\n"
                        + "status\r\n"
                        + "park KA-01-P-333 White\r\n"
                        + "park DL-12-AA-9999 White\r\n"
                        + "registration_numbers_for_cars_with_colour White\r\n"
                        + "slot_numbers_for_cars_with_colour White\r\n"
                        + "slot_number_for_registration_number KA-01-HH-3141\r\n"
                        + "slot_number_for_registration_number MH-04-AY-1111\r\n"
                        + "exit\r\n";

        String expectedOutput = "Welcome to Go-Jek Parking lot.\n"
                        + "Created a parking lot with 6 slots\n"
                        + "Allocated slot number: 1\n"
                        + "Allocated slot number: 2\n"
                        + "Allocated slot number: 3\n"
                        + "Allocated slot number: 4\n"
                        + "Allocated slot number: 5\n"
                        + "Allocated slot number: 6\n"
                        + "Slot number 4 is free\n"
                        + "Slot No.    Registration No    Colour\n"
                        + "1           KA-01-HH-1234      White\n"
                        + "2           KA-01-HH-9999      White\n"
                        + "3           KA-01-BB-0001      Black\n"
                        + "5           KA-01-HH-2701      Blue\n"
                        + "6           KA-01-HH-3141      Black\n"
                        + "Allocated slot number: 4\n"
                        + "Sorry, parking lot is full\n"
                        + "KA-01-HH-1234, KA-01-HH-9999, KA-01-P-333\n"
                        + "1, 2, 4\n"
                        + "6\n"
                        + "Not found\n"
                        + "Thanks for using Go-Jek Parking lot service.\n";

        ByteArrayInputStream in = new ByteArrayInputStream(commands.getBytes());
        System.setIn(in);

        Main.main(new String[] {});
        System.out.println(expectedOutput);
        System.out.println(outputContent.toString());
    }

    @Test
    public void testStatusOfEmptyParkingLot() throws IOException{
        String command = "CREATE_PARKING_LOT 6\r\n"+"status\r\n"+"exit\r\n";
        String expectedOutput =  "Welcome to Go-Jek Parking lot.\n"
                + "Created a parking lot with 6 slots\n"
                + "Parking lot is empty\n"
                + "Thanks for using Go-Jek Parking lot service.\n";

        ByteArrayInputStream in = new ByteArrayInputStream(command.getBytes());
        System.setIn(in);

        Main.main(new String[] {});
        System.out.println(expectedOutput);
        System.out.println(outputContent.toString());
    }

    @Test
    public void testInvalidCommandParams() throws Exception{
        String command = "CREATE_PARKING_LOT 6 1\r\n";
        ByteArrayInputStream in = new ByteArrayInputStream(command.getBytes());
        System.setIn(in);

        Main.main(new String[] {});
    }

    @Test
    public void testFileMode() throws IOException{
        String expectedOutput = "Created a parking lot with 6 slots\n"
                + "Allocated slot number: 1\n"
                + "Allocated slot number: 2\n"
                + "Allocated slot number: 3\n"
                + "Allocated slot number: 4\n"
                + "Allocated slot number: 5\n"
                + "Allocated slot number: 6\n"
                + "Slot number 4 is free\n"
                + "Slot No.    Registration No    Colour\n"
                + "1           KA-01-HH-1234      White\n"
                + "2           KA-01-HH-9999      White\n"
                + "3           KA-01-BB-0001      Black\n"
                + "5           KA-01-HH-2701      Blue\n"
                + "6           KA-01-HH-3141      Black\n"
                + "Allocated slot number: 4\n"
                + "Sorry, parking lot is full\n"
                + "KA-01-HH-1234, KA-01-HH-9999, KA-01-P-333\n"
                + "1, 2, 4\n"
                + "6\n"
                + "Not found\n";

        Main.main(new String[]{"file_input.txt"});
        System.out.println(expectedOutput);
        System.out.println(outputContent.toString());
    }

    @Test
    public void testFileModeWithInvalidFile() throws IOException{
        String expectedOutput = "INVALID FILE GIVEN.\n";

        Main.main(new String[]{"some_random_file.txt"});
        System.out.println(expectedOutput);
        System.out.println(outputContent.toString());
    }

    @Test(expected = InvalidModeException.class)
    public void testInvalidMode() throws IOException {
        Main.main(new String[]{"file_input.txt", "some-other-input"});
    }
}
