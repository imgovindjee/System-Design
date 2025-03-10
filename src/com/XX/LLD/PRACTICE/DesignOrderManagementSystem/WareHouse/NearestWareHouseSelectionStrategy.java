package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse;

import java.util.List;

public class NearestWareHouseSelectionStrategy extends WareHouseSelectionStrategy{

    @Override
    public WareHouse selectWareHouse(List<WareHouse> wareHouseList) {
//        BUSINESS LOGIC
//        FOR PICKING UP THE NEAREST PLACE AROUND ME
        return wareHouseList.get(0);
    }
}
