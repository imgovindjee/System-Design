package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.DriverCode;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Address;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Inventory;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order.Order;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product.Product;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product.ProductCategory;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product.ProductDeliverySystem;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User.User;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.NearestWareHouseSelectionStrategy;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private WareHouse addWareHouseAndItsInventory(){
        WareHouse wareHouse = new WareHouse();

        Inventory inventory = new Inventory();
        inventory.addCategory(1001, "PEPSSI LARGE COLD DRINK", 100);
        inventory.addCategory(1002, "SPRITE COLD DRINK", 100);
        inventory.addCategory(2001, "NOODLES", 14);

//        CREATING PRODUCTS
        Product product1 = new Product();
        product1.setProductID(1);
        product1.setProductName("PEPPSI");

        Product product2 = new Product();
        product2.setProductID(2);
        product2.setProductName("SPRITE");

        Product product3 = new Product();
        product3.setProductID(3);
        product3.setProductName("NOODLES");

        inventory.addProduct(product1, 1001);
        inventory.addProduct(product2, 1002);
        inventory.addProduct(product3, 2001);

        wareHouse.setInventory(inventory);
        return wareHouse;
    }

    private User createUser(){
        User user = new User();
        user.setUserID(1);
        user.setUserName("PRIYANKA");
        user.setAddress(new Address(000000, "CITY", "STATE"));
        return user;
    }

    private void runDeliveryFlow(ProductDeliverySystem productDeliverySystem, int userID){
//        1. GET USER OBJECT
        User user = productDeliverySystem.getUser(userID);

//        2. GET WAREHOUSE BASED ON USER PREFERENCE
        WareHouse wareHouse = productDeliverySystem.getWareHouse(new NearestWareHouseSelectionStrategy());

//        3. GET ALL THE INVENTORY TO SHOW THE USER
        Inventory inventory = productDeliverySystem.getInventory(wareHouse);

        ProductCategory productCategoryIWantToOrder = null;
        for (ProductCategory pc: inventory.getProductCategoryList()){
            if((pc.getCategoryName()).equals("PEPSSI LARGE COLD DRINK")){
                productCategoryIWantToOrder = pc;
            }
        }

//        4. ADD PAYMENT TO CART
        productDeliverySystem.addProductToCart(user, productCategoryIWantToOrder, 2);

//        5. PLACE ORDER
        Order order = productDeliverySystem.placeOrder(user, wareHouse);

//        6. CHECKOUT
        productDeliverySystem.checkOut(order);
    }


//    DRIVE CODE
    public static void main(String[] args) {
        Main orderManagementSystem_main = new Main();

//        1. CREATE WAREHOUSE IN THE SYSTEM
        List<WareHouse> wareHouseList = new ArrayList<>();
        wareHouseList.add(orderManagementSystem_main.addWareHouseAndItsInventory());

//        2. CREATE USER IN THE SYSTEM
        List<User> userList = new ArrayList<>();
        userList.add(orderManagementSystem_main.createUser());

//        3. FEED THE SYSTEM WITH THE INITIAL INFORMATION
        ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(userList, wareHouseList);
        orderManagementSystem_main.runDeliveryFlow(productDeliverySystem, 1);
    }
}
