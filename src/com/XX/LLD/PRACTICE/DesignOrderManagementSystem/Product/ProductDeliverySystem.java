package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Cart;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Inventory;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order.Order;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order.OrderController;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User.User;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User.UserController;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouse;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouseController;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouseSelectionStrategy;

import java.util.List;

public class ProductDeliverySystem {

    UserController userController;
    WareHouseController wareHouseController;
    OrderController orderController;

    public ProductDeliverySystem(List<User> userList, List<WareHouse> wareHouseList) {
        userController = new UserController(userList);
        wareHouseController = new WareHouseController(wareHouseList, null);
        orderController = new OrderController();
    }

//    GET USER OBJECT
    public User getUser(int userID){
        return userController.getUser(userID);
    }

//    GET WAREHOUSE
    public WareHouse getWareHouse(WareHouseSelectionStrategy wareHouseSelectionStrategy){
        return wareHouseController.selectWareHouse(wareHouseSelectionStrategy);
    }

//    GET INVENTORY
    public Inventory getInventory(WareHouse wareHouse){
        return wareHouse.getInventory();
    }

//    ADD PRODUCT TO CART
    public void addProductToCart(User user, ProductCategory productCategory, int count){
        Cart cart = user.getUserCart();
        cart.addItemInCart(productCategory.getProductCategoryID(), count);
    }

//    PLACE ORDER
    public Order placeOrder(User user, WareHouse wareHouse){
        return orderController.createOrder(user, wareHouse);
    }

    public void checkOut(Order order){
        order.checkOut();
    }
}
