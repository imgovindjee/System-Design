package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities;

public class Post {

    private Integer postID;
    private Integer userID;
    private Integer createdAt;
    private String content;

    private static int TIME = 1;

    /**
     *
     * {@AllArgsConstructor}
     * @param postID unique postID of each post
     * @param userID unique userID of each post
     * @param content of the post
     */
    public Post(Integer postID, Integer userID, String content) {
        this.postID = postID;
        this.userID = userID;
        this.content = content;
        this.createdAt = TIME++;
    }

//    GETTER AND SETTER
    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
