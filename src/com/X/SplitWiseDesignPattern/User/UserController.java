package com.X.SplitWiseDesignPattern.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private List<User> users;

    public UserController(){
        this.users = new ArrayList<>();
    }

//    ADD USER
    public void addUser(User user){
        users.add(user);
        System.out.println("A new user having\n" +
                "UserID: "+user.getUserID()+
                "\nUserName: "+user.getUserName()+
                "\nhas been added.");
    }

//    GET USER
    public User getUser(String userID){
        for (User user:users){
            if(user.getUserID().equals(userID)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return users;
    }
}
