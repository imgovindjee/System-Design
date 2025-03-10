package com.XX.LLD.PRACTICE.MusicStreamingSystem;

import com.XX.LLD.PRACTICE.MusicStreamingSystem.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MusicRecommendation {

    private static MusicRecommendation musicRecommendation;
    private Map<String, List<Song>> stringListMap;

    private MusicRecommendation(){
        this.stringListMap = new ConcurrentHashMap<>();
    }

    public static synchronized MusicRecommendation getInstance(){
        if (musicRecommendation == null){
            musicRecommendation = new MusicRecommendation();
        }
        return musicRecommendation;
    }

    public List<Song> recommendedSongs(User user){
        List<PlayList> list = user.getPlayListList();
        for (PlayList playList: list){
            if (playList.getSongList().size()%2==1){
                List<Song> songList = stringListMap.getOrDefault(user.getUserID(), new ArrayList<>());
                for (Song song:playList.getSongList()){
                    songList.add(song);
                }
                stringListMap.put(user.getUserID(), songList);
            }
        }
        return stringListMap.getOrDefault(user.getUserID(), new ArrayList<>());
//        BUSINESS LOGIC HERE
    }
}
