package com.Y.LLD.QUESTIONS.VendingMachine.VendingState.ImplementationPart;

import com.Y.LLD.QUESTIONS.VendingMachine.Coin;
import com.Y.LLD.QUESTIONS.VendingMachine.Item;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingMachine;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

//    CONSTRUCTOR
    public IdleState(){
        System.out.println("Currently Vending Machine is in IDLE-STATE");
    }
    public IdleState(VendingMachine vendingMachine){
        System.out.println("Currently Vending Machine is in IDLE-STATE");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not insert coin in IDLE-STATE");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in IDLE-STATE");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You can not choose product in IDLE-STATE");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in IDLE-STATE");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed in IDLE-STATE");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Yoy can not get Refund in IDLE-STATE");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        vendingMachine.getInventory().addItem(item, codeNumber);
    }
}
