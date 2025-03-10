package com.Y.LLD.QUESTIONS.VendingMachine.VendingState.ImplementationPart;

import com.Y.LLD.QUESTIONS.VendingMachine.Item;
import com.Y.LLD.QUESTIONS.VendingMachine.Coin;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingMachine;
import com.Y.LLD.QUESTIONS.VendingMachine.VendingState.State;

import java.util.List;

public class SelectionState implements State {

//    CONSTRUCTOR
    public SelectionState() {
        System.out.println("Currently Vending Machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Yoy can not click on insert coin button in Selection STATE");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Yoy can not insert coin in Selection STATE");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
//        1. getItem of this.codeNumber
        Item item = vendingMachine.getInventory().getItem(codeNumber);

//        2. amount to be paid in total
        int paidByUser = 0;
        for(Coin coin:vendingMachine.getCoinList()) {
            paidByUser += coin.value;
        }

//        3. compare product price and amount_paid_by_user
        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient Amount, Product you have selected is of price: "+item.getPrice() + " and you just paid: "+ paidByUser);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient Amount");
        } else if(paidByUser >= item.getPrice()) {
            if(paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DespenseState(vendingMachine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the coin Dispensed tray: "+returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product can not be Dispensed in Selection STATE");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection STATE");
    }
}
