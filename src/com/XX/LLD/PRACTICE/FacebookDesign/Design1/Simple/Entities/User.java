package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities;

import java.util.HashSet;
import java.util.Set;

public class User {

    private Integer userID;
    private String name;
    private Set<Integer> followed;
    private Set<Integer> userPostID;

    /**
     *
     * {@AllArgsConstructor}
     * @param userID unique userID to determine the person uniquely
     * @param name username of the user
     */
    public User(Integer userID, String name) {
        this.userID = userID;
        this.name = name;
        this.followed = new HashSet<>();
        this.userPostID = new HashSet<>();
    }

//    GETTER AND SETTER
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getFollowed() {
        return followed;
    }

    public void setFollowed(Set<Integer> followed) {
        this.followed = followed;
    }

    public Set<Integer> getUserPostID() {
        return userPostID;
    }

    public void setUserPostID(Set<Integer> userPostID) {
        this.userPostID = userPostID;
    }
}
