package com.XX.LLD.PRACTICE.MusicStreamingSystem.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserManager {

    private static UserManager userManager;
    private Map<String, User> userMap;

    private UserManager(){
        this.userMap = new ConcurrentHashMap<>();
    }

    public static synchronized UserManager getInstance(){
        if (userManager == null){
            userManager = new UserManager();
        }
        return userManager;
    }


    public void registerUser(User user){
        userMap.put(user.getUserID(), user);
    }

    public User userLogin(String username, String password){
        for (User user:userMap.values()){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
