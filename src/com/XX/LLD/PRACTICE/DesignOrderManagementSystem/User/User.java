package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Address;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Cart;

import java.util.ArrayList;
import java.util.List;

public class User {

    int userID;
    String userName;
    Address address;
    Cart userCartDetails;
    List<Integer> orderIDList;

    public User() {
        userCartDetails = new Cart();
        orderIDList = new ArrayList<>();
    }

//    get USER cart
    public Cart getUserCart(){
        return userCartDetails;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getUserCartDetails() {
        return userCartDetails;
    }

    public void setUserCartDetails(Cart userCartDetails) {
        this.userCartDetails = userCartDetails;
    }

    public List<Integer> getOrderIDList() {
        return orderIDList;
    }

    public void setOrderIDList(List<Integer> orderIDList) {
        this.orderIDList = orderIDList;
    }
}
