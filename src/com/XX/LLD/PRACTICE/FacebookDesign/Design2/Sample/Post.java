package com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample;

import java.sql.Timestamp;
import java.util.List;

public class Post {

    private String postID;
    private String userID;
    private String content;
    private List<String> imageURL;
    private List<String> videoURL;
    private List<String> likes;
    private List<Comments> comments;
    private Timestamp timestamp;

    public Post(String postID, String userID, String content, List<String> imageURL, List<String> videoURL, List<String> likes, List<Comments> comments, Timestamp timestamp) {
        this.postID = postID;
        this.userID = userID;
        this.content = content;
        this.imageURL = imageURL;
        this.videoURL = videoURL;
        this.likes = likes;
        this.comments = comments;
        this.timestamp = timestamp;
    }

    public String getPostID() {
        return postID;
    }

    public String getUserID() {
        return userID;
    }

    public String getContent() {
        return content;
    }

    public List<String> getImageURL() {
        return imageURL;
    }

    public List<String> getVideoURL() {
        return videoURL;
    }

    public List<String> getLikes() {
        return likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
