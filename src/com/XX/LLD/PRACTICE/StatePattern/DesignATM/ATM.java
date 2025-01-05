package com.XX.LLD.PRACTICE.StatePattern.DesignATM;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates.ATMState;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates.IdleState;

public class ATM {

    private static ATM atm = new ATM(); // SINGLETON: EAGER INITIALIZATION
    ATMState currentAtmState;

    private int atmBalance;
    int noOfOneHundredNotes;
    int noOfTwoHundredNotes;
    int noOfFiveHundredNotes;

//    CONSTRUCTOR
    private ATM(){}

    public static ATM getAtm() {
        atm.setCurrentAtmState(new IdleState());
        return atm;
    }

    public ATMState getCurrentAtmState() {
        return currentAtmState;
    }

    public void setCurrentAtmState(ATMState currentAtmState) {
        this.currentAtmState = currentAtmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfOneHundredNotes, int noOfTwoHundredNotes, int noOfFiveHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
        this.noOfTwoHundredNotes = noOfTwoHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public int getNoOfTwoHundredNotes() {
        return noOfTwoHundredNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void deductATMBalance(int amount){
        atmBalance = atmBalance - amount;
    }

    public void deductOneHundredNote(int note_count) {
        noOfOneHundredNotes -= note_count;
    }

    public void deductTwoHundredNote(int note_count) {
        noOfTwoHundredNotes -= note_count;
    }

    public void deductFiveHundredNote(int note_count) {
        noOfFiveHundredNotes -= note_count;
    }

    public void printCurrentATMStatus() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("BALANCE: "+atmBalance);
        System.out.println("100 Note: "+noOfOneHundredNotes);
        System.out.println("200 Note: "+noOfTwoHundredNotes);
        System.out.println("500 Note: "+noOfFiveHundredNotes);
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
