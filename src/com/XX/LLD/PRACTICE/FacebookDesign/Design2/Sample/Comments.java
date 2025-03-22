package com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample;

import java.sql.Timestamp;

public class Comments {

    private String commentID;
    private String userID;
    private String postID;
    private String content;
    private Timestamp timestamp;

    public Comments(String commentID, String userID, String postID, String content, Timestamp timestamp) {
        this.commentID = commentID;
        this.userID = userID;
        this.postID = postID;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getUserID() {
        return userID;
    }

    public String getPostID() {
        return postID;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
