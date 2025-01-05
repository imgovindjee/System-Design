package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order.Order;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User.User;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

    List<Order> orderList;
    Map<Integer, List<Order>> userID_order;

//    CONSTRUCTOR INJECTION
    public OrderController(){
        this.orderList = new ArrayList<>();
        this.userID_order = new HashMap<>();
    }

//    CREATE NEW ORDER
    public Order createOrder(User user, WareHouse wareHouse){
        Order order = new Order(user, wareHouse);
        orderList.add(order);

        if(userID_order.containsKey(user.getUserID())){
            List<Order> orderList1 = userID_order.get(user.getUserID());
            orderList1.add(order);
            userID_order.put(user.getUserID(), orderList1);
        } else {
            List<Order> orderList1 = new ArrayList<>();
            orderList1.add(order);
            userID_order.put(user.getUserID(), orderList1);
        }
        return order;
    }

//    REMOVE ORDER
    public void removeOrder(Order order){
//        REMOVE ORDER CAPABILITY
//        BUSINESS LOGIC
    }

    public List<Order> getOrderByCustomerID(int userID){
        for (int uo: userID_order.keySet()){
            if( uo == userID) {
                return userID_order.get(userID);
            }
        }
        return null;
    }

    public Order getOrderByOrderID(int orderId){
        return null;
    }
}
