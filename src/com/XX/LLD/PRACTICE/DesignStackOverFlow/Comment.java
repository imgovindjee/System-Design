package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.Date;

public class Comment {

    private final int commentID;
    private String content;
    private User user;
    private final Date creationDate;

    public Comment(User user, String content) {
        this.commentID = generateID();
        this.content = content;
        this.user = user;
        this.creationDate = new Date();
    }

    public int getCommentID() {
        return commentID;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Date getCreationDate() {
        return creationDate;
    }


    private int generateID(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
