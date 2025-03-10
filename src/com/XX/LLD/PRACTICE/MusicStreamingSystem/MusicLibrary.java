package com.XX.LLD.PRACTICE.MusicStreamingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MusicLibrary {

    private static MusicLibrary musicLibrary;
    private Map<String, Song> songMap;
    private Map<String, Album> albumMap;
    private Map<String, Artist> artistMap;

    private MusicLibrary(){
        this.albumMap = new ConcurrentHashMap<>();
        this.songMap = new ConcurrentHashMap<>();
        this.artistMap = new ConcurrentHashMap<>();
    }

    public static synchronized MusicLibrary getInstance(){
        if (musicLibrary == null){
            musicLibrary = new MusicLibrary();
        }
        return musicLibrary;
    }

    public void addSong(Song song){
        songMap.put(song.getSongID(), song);
    }

    public void addAlbum(Album album){
        albumMap.put(album.getAlbumID(), album);
        for (Song song: album.getSongList()){
            addSong(song);
        }
    }

    public void addArtist(Artist artist){
        artistMap.put(artist.getArtistID(), artist);
        for (Album album:artist.getAlbumList()){
            addAlbum(album);
        }
    }

    public Song getSong(String songID){
        return songMap.get(songID);
    }

    public Album getAlbum(String albumID){
        return albumMap.get(albumID);
    }

    public Artist getArtist(String artistID){
        return artistMap.get(artistID);
    }


    public List<Song> searchSong(String query){
        List<Song> songList = new ArrayList<>();
        for (Song song:songMap.values()){
            if (song.getSongTitle().contains(query) || song.getArtist().contains(query) || song.getAlbum().contains(query)){
                songList.add(song);
            }
        }
        return songList;
    }
}
