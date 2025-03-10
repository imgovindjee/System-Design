package com.XX.LLD.PRACTICE.MusicStreamingSystem.Service;

import com.XX.LLD.PRACTICE.MusicStreamingSystem.MusicLibrary;
import com.XX.LLD.PRACTICE.MusicStreamingSystem.MusicRecommendation;
import com.XX.LLD.PRACTICE.MusicStreamingSystem.User.UserManager;

public class MusicStreamingService {

    private MusicLibrary musicLibrary;
    private UserManager userManager;
    private MusicRecommendation musicRecommendation;

    public MusicStreamingService(){
        this.musicLibrary = MusicLibrary.getInstance();
        this.userManager = UserManager.getInstance();
        this.musicRecommendation = MusicRecommendation.getInstance();
    }

    public MusicLibrary getMusicLibrary() {
        return musicLibrary;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public MusicRecommendation getMusicRecommendation() {
        return musicRecommendation;
    }

    public void start(){

    }
}
