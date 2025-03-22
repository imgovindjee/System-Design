package com.XX.LLD.PRACTICE.MusicStreamingSystem.ServiceImplementation;

import com.XX.LLD.PRACTICE.MusicStreamingSystem.*;
import com.XX.LLD.PRACTICE.MusicStreamingSystem.Service.MusicStreamingService;
import com.XX.LLD.PRACTICE.MusicStreamingSystem.User.User;

import java.util.List;

public class MusicServiceImplementation {
    public static void run(){
//        create a service instance
        MusicStreamingService musicStreamingService = new MusicStreamingService();

//        Create Songs
        Song song1 = new Song("S1", "S-T-1", "A-1", "ALBUM1", 190);
        Song song2 = new Song("S2", "S-T-3", "A-1", "ALBUM1", 192);
        Song song3 = new Song("S3", "S-T-2", "A-2", "ALBUM3", 110);
        Song song4 = new Song("S4", "S-T-4", "A-3", "ALBUM2", 149);

//        create albums
        Album album1 = new Album("ALBUM1", "T1", "A-1", List.of(song1, song2));
        Album album2 = new Album("ALBUM2", "T2", "A-2", List.of(song3));
        Album album3 = new Album("ALBUM3", "T3", "A-3", List.of(song4));

//        create artist
        Artist artist1 = new Artist("A1", "A-N-1", List.of(album1));
        Artist artist2 = new Artist("A2", "A-N-2", List.of(album2));
        Artist artist3 = new Artist("A3", "A-N-3", List.of(album3));

//        adding artists to the music library
        musicStreamingService.getMusicLibrary().addArtist(artist1);
        musicStreamingService.getMusicLibrary().addArtist(artist2);
        musicStreamingService.getMusicLibrary().addArtist(artist3);


//        Create a user
        User user1 = new User("U1", "QWERTY", "password");
        User user2 = new User("U2", "priyanka", "password");
        User user3 = new User("U3", "John", "password");

//        User Reg
        musicStreamingService.getUserManager().registerUser(user1);
        musicStreamingService.getUserManager().registerUser(user2);
        musicStreamingService.getUserManager().registerUser(user3);

//        Logged in user
        User loggedInUser = musicStreamingService.getUserManager().userLogin("priyanka", "password");
        if (loggedInUser != null){
            System.out.println("User logged in @"+loggedInUser.getUsername());
        } else {
            System.out.println("Invalid username or password");
        }

//        Search a song
        List<Song> searchedSongList = musicStreamingService.getMusicLibrary().searchSong("S");
        System.out.println("\n--------------Search Song----------------------");
        for (Song song: searchedSongList){
            System.out.println("Song Title: "+song.getSongTitle());
            System.out.println("Song Artist: "+song.getArtist());
            System.out.println();
        }

//        Create a playlist
        createPlayList(loggedInUser, List.of(song1, song2), "PL1", "My Playlist1");
        createPlayList(loggedInUser, List.of(song4, song3), "PL2", "My Playlist3");
        createPlayList(loggedInUser, List.of(song1, song2, song4), "PL3", "My Playlist2");

//        Get Song Recommendation
        List<Song> recommendationSongList = musicStreamingService.getMusicRecommendation().recommendedSongs(loggedInUser);
        System.out.println("\n-----------------Recommended Song List-------------------");
        for (Song song: recommendationSongList){
            System.out.println("Song Title: "+song.getSongTitle());
            System.out.println("Song Artist: "+song.getArtist());
            System.out.println();
        }

//        Play a Song
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playSong(song1);

//        Pause a Song
        musicPlayer.pauseSong();

//        seek a specific song
        musicPlayer.seekTo(63);

//        Get user's playlist's
        List<PlayList> userPlaylist = loggedInUser.getPlayListList();
        System.out.println("\n----------------User PlayList---------------");
        for (PlayList playList: userPlaylist){
            System.out.println("PlayList: "+playList.getPlaylistName());
            System.out.println("Songs: ");
            for (Song song: playList.getSongList()){
                System.out.println("\t\tSong Title: "+song.getSongTitle());
                System.out.println("\t\tSong Duration: "+song.getDuration()+"sec");
                System.out.println();
            }
        }
    }


    private static void createPlayList(User user, List<Song> songList, String playListID, String playListName){
        PlayList playList1 = new PlayList(playListID, playListName, user);
        for (Song song:songList){
            playList1.addSong(song);
        }
        user.addPlaylist(playList1);
    }
}
