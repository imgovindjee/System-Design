package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User;

import java.util.List;

public class UserController {

    List<User> userList;

    public UserController(List<User> userList) {
        this.userList = userList;
    }

//    ADD USER
    public void addUser(User user){
        userList.add(user);
    }

//    REMOVE USER
    public void removeUser(User user){
        userList.remove(user);
    }

//    GET PARTICULAR USER
    public User getUser(int userID){
        for(User user:userList){
            if(user.userID == userID){
                return user;
            }
        }
        return null;
    }
}
