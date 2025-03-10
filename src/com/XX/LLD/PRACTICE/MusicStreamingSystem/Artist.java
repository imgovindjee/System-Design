package com.XX.LLD.PRACTICE.MusicStreamingSystem;

import java.util.List;

public class Artist {

    private String artistID;
    private String artistName;
    private List<Album> albumList;

    public Artist(String artistID, String artistName, List<Album> albumList) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.albumList = albumList;
    }

    public String getArtistID() {
        return artistID;
    }

    public void setArtistID(String artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }
}
