package com.XX.LLD.PRACTICE.DesignParkingLot.Validator;

public class IntegerValidator {
    public boolean isInteger(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException exception){
            return false;
        }
    }
}
