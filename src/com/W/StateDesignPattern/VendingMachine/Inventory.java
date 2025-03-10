package com.W.StateDesignPattern.VendingMachine;

public class Inventory {

    ItemShelf[] inventory_itemShelves = null;
//   CONSTRUCTOR
    public Inventory(int itemCount){
        inventory_itemShelves = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory_itemShelves;
    }

    public void setInventory(ItemShelf[] inventory_itemShelves) {
        this.inventory_itemShelves = inventory_itemShelves;
    }

    public void initialEmptyInventory(){
        int startCOde = 101;
        for(int i=0; i<inventory_itemShelves.length; i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(startCOde);
            itemShelf.setSoldOut(true);
            inventory_itemShelves[i] = itemShelf;
            startCOde++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for(ItemShelf itemShelf: inventory_itemShelves) {
            if(itemShelf.code == codeNumber) {
                if(itemShelf.isSoldOut()) {
                    itemShelf.item = item;
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Already item is Present, You can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf: inventory_itemShelves) {
            if(itemShelf.code == codeNumber) {
                if(itemShelf.isSoldOut()) {
                    throw new Exception("Item is already SoldOut");
                } else {
                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for(ItemShelf itemShelf:inventory_itemShelves) {
            if(itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
