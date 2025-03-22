package com.XX.LLD.PRACTICE.MusicStreamingSystem.User;

import com.XX.LLD.PRACTICE.MusicStreamingSystem.PlayList;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userID;
    private String username;
    private String password;
    private List<PlayList> playListList;

    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.playListList = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<PlayList> getPlayListList() {
        return playListList;
    }

    /**
     * Add playlist to the list
     * @param playList args
     */
    public void addPlaylist(PlayList playList){
        playListList.add(playList);
    }

    /**
     * remove playlist form the list
     * @param playList args
     */
    public void removePlaylist(PlayList playList){
        playListList.remove(playList);
    }
}
