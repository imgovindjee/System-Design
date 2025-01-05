package com.W.StateDesignPattern.VendingMachine.VendingState.ImplementationPart;

import com.W.StateDesignPattern.VendingMachine.Coin;
import com.W.StateDesignPattern.VendingMachine.Item;
import com.W.StateDesignPattern.VendingMachine.VendingMachine;
import com.W.StateDesignPattern.VendingMachine.VendingState.State;

import java.util.List;

public class DespenseState implements State {

//    CONSTRUCTOR
    public DespenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in Dispensed-STATE");
        dispenseProduct(vendingMachine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Insert coin button can not be clicked in Dispensed STATE");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Product selection button can not be clicked in Dispensed STATE");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Coin can not be inserted in Dispensed STATE");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can not be chosen in Dispensed STATE");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Change can not be returned in Dispensed STATE");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Item has been Dispensed");

        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Refund can not be happening in Dispensed STATE");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Dispensed STATE");
    }


}
