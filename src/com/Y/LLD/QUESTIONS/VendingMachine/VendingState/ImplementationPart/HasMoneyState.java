package com.Y.LLD.QUESTIONS.VendingMachine.VendingState.ImplementationPart;

import com.Y.LLD.QUESTIONS.VendingMachine.Item;
import com.Y.LLD.QUESTIONS.VendingMachine.Coin;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingMachine;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingState.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending Machine is in HasMoneyState.");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
//        System.out.println("Accepted the coin");
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin: "+coin.value);
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in hasMoney-STATE");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed in hasMoney-STATE");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("You can not update inventory in hasMoney-STATE");
    }
}
