package com.XX.LLD.PRACTICE.MusicStreamingSystem;

import java.util.List;

public class Album {

    private String albumID;
    private String title;
    private String artist;
    private List<Song> songList;

    public Album(String albumID, String title, String artist, List<Song> songList) {
        this.albumID = albumID;
        this.title = title;
        this.artist = artist;
        this.songList = songList;
    }

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
