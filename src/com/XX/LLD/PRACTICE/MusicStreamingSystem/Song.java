package com.XX.LLD.PRACTICE.MusicStreamingSystem;

public class Song {

    private String songID;
    private String songTitle;
    private String artist;
    private String album;
    private int duration;

    public Song(String songID, String songTitle, String artist, String album, int duration) {
        this.songID = songID;
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
