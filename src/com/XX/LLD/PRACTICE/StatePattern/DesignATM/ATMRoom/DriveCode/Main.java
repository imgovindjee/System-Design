package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMRoom.DriveCode;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.TransactionType;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.User.User;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.User.UserBankAmount;

public class Main {
    ATM atm;
    User user;

    private void initilize(){
//        CREATING ATM
        atm = ATM.getAtm();
        atm.setAtmBalance(10000, 10, 5, 16);

//        CREATE USER
        this.user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card = new Card();
        card.setBankAccount(createBankAmount());
        return card;
    }

    private UserBankAmount createBankAmount() {
        UserBankAmount userBankAmount = new UserBankAmount();
        userBankAmount.setBalance(3000);
        return userBankAmount;
    }


//    DRIVE CODE
    public static void main(String[] args) {
        Main atm_room = new Main();
        atm_room.initilize();

        atm_room.atm.printCurrentATMStatus();

//        TRANSACTION TYPE 1
        atm_room.atm.getCurrentAtmState().insertCard(atm_room.atm, atm_room.user.getCard());
        atm_room.atm.getCurrentAtmState().authenticatePin(atm_room.atm, atm_room.user.getCard(), 000000);
        atm_room.atm.getCurrentAtmState().selectOperation(atm_room.atm, atm_room.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atm_room.atm.getCurrentAtmState().cashWithDrawal(atm_room.atm, atm_room.user.getCard(), 2700);

        atm_room.atm.printCurrentATMStatus();
        System.out.println("\n\n\n" +
                "---------------------------------------------------------------------------------------------------");
//        TRANSACTION TYPE 2
        atm_room.atm.getCurrentAtmState().insertCard(atm_room.atm, atm_room.user.getCard());
        atm_room.atm.getCurrentAtmState().authenticatePin(atm_room.atm, atm_room.user.getCard(), 000000);
        atm_room.atm.getCurrentAtmState().selectOperation(atm_room.atm, atm_room.user.getCard(), TransactionType.BALANCE_CHECK);
        atm_room.atm.getCurrentAtmState().displayBalance(atm_room.atm, atm_room.user.getCard());
    }
}
