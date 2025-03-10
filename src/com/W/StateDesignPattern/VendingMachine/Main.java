package com.W.StateDesignPattern.VendingMachine;

import com.W.StateDesignPattern.VendingMachine.VendingState.State;

public class Main {
    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (ItemShelf slot : slots) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getItemType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + !slot.isSoldOut());
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves_slots = vendingMachine.getInventory().getInventory();
        for(int i=0; i<itemShelves_slots.length; i++) {
            Item newItem = new Item();
            if(i>=0 && i<3){
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            } else if(i>=3 && i<5){
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if(i>=5 && i<7){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if(i>=7 && i<9){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            } else if(i>=9) {
                newItem.setItemType(ItemType.SPRITE);
                newItem.setPrice(10);
            }

            itemShelves_slots[i].setItem(newItem);
            itemShelves_slots[i].setSoldOut(false);
        }
    }


//    DRIVE CODE
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("Filling up the Inventory...");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("Click on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("Click on Product Selection Button");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);
        } catch (Exception e) {
            displayInventory(vendingMachine);
        }
    }
}
