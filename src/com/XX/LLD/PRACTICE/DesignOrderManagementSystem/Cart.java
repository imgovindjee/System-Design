package com.XX.LLD.PRACTICE.DesignOrderManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Integer, Integer> productCategoryIDCountMap;

//    CONSTRUCTOR INJECTION
    public Cart() {
        this.productCategoryIDCountMap = new HashMap<>();
    }

//    ADDING ITEM TO THE CART
    public void addItemInCart(int productCategoryID, int count){
        System.out.println("--------------------ADDING PRODUCT TO CART------------------");
        if(productCategoryIDCountMap.containsKey(productCategoryID)){
            productCategoryIDCountMap.put(productCategoryID, productCategoryIDCountMap.get(productCategoryID)+count);
        } else {
            productCategoryIDCountMap.put(productCategoryID, count);
        }
        System.out.println("--------------------Product added to the Cart----------------------");
    }

//    REMOVE ITEM FROM THE CART
    public void removeItemFromCart(int productCategoryID, int count){
        System.out.println("--------------------REMOVING PRODUCT FROM CART------------------");
        if(productCategoryIDCountMap.containsKey(productCategoryID)) {
            int noOfItemsInCart = productCategoryIDCountMap.get(productCategoryID);
            if(count - noOfItemsInCart == 0){
                productCategoryIDCountMap.remove(productCategoryID);
            } else {
                productCategoryIDCountMap.put(productCategoryID, noOfItemsInCart-count);
            }
        }
        System.out.println("--------------Product Removed From Cart----------------------");
    }

//    EMPTY CART
    public void emptyCart(){
        productCategoryIDCountMap = new HashMap<>();
    }

//    VIEW CART
//    ITERATE OVER THE CART
    public Map<Integer, Integer> getCartItems(){
        return productCategoryIDCountMap;
    }
}
