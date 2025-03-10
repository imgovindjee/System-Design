package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Address;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Inventory;

import java.util.Map;

public class WareHouse {

    Inventory inventory;
    Address address;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    //    UPDATE INVENTORY
    public void removeItemFromInventory(Map<Integer, Integer> productCategoryCountMap){
        inventory.removeItems(productCategoryCountMap);
    }

//    ADD ITEM TO THE INVENTORY
    public void addItemToInventory(Map<Integer, Integer> productCategoryCountMap) {
//        BUSINESS LOGIC
    }
}
