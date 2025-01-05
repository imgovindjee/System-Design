package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse;

import java.util.List;

public class WareHouseController {

    List<WareHouse> wareHouseList;
    WareHouseSelectionStrategy wareHouseSelectionStrategy = null;

//    CONSTRUCTOR INJECTION
    public WareHouseController(List<WareHouse> wareHouseList, WareHouseSelectionStrategy wareHouseSelectionStrategy) {
        this.wareHouseList = wareHouseList;
        this.wareHouseSelectionStrategy = wareHouseSelectionStrategy;
    }

    //    ADD NEW WAREHOUSE
    public void addNewWareHouse(WareHouse wareHouse){
        wareHouseList.add(wareHouse);
    }

//    REMOVE WAREHOUSE
    public void removeWareHouse(WareHouse wareHouse){
        wareHouseList.remove(wareHouse);
    }

//    SELECT PARTICULAR WAREHOUSE
    public WareHouse selectWareHouse(WareHouseSelectionStrategy houseSelectionStrategy){
        this.wareHouseSelectionStrategy = houseSelectionStrategy;
        return wareHouseSelectionStrategy.selectWareHouse(wareHouseList);
    }
}
