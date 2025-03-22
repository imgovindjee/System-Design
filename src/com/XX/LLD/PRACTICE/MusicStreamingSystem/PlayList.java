package com.XX.LLD.PRACTICE.MusicStreamingSystem;


import com.XX.LLD.PRACTICE.MusicStreamingSystem.User.User;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String playlistID;
    private String playlistName;
    private User owner;
    private List<Song> songList;

    public PlayList(String playlistID, String playlistName, User owner) {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.owner = owner;
        this.songList = new ArrayList<>();
    }

    public String getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(String playlistID) {
        this.playlistID = playlistID;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    /**
     * adding the particular song to the song-list
     * @param song args
     */
    public void addSong(Song song){
        songList.add(song);
    }

    /**
     * remove the particular song from the song-list
     * @param song args
     */
    public void removeSong(Song song){
        songList.remove(song);
    }
}
