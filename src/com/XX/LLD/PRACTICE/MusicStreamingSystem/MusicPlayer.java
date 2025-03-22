package com.XX.LLD.PRACTICE.MusicStreamingSystem;

public class MusicPlayer {

    private Song currentSong;
    private boolean isPlaying;
    private int currentTime;

    public void playSong(Song song){
        currentSong = song;
        isPlaying = true;
        currentTime = 0;
//        Start playing the song logic HERE
    }

    public void pauseSong(){
        isPlaying = false;
//        BUSINESS LOGIC HERE
    }

    public void seekTo(int time){
        currentTime = time;
//        Seek to the specified time in the song
    }
}
