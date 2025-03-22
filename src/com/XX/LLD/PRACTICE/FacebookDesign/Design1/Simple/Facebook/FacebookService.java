package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Facebook;

import java.util.List;

public interface FacebookService {

    public void addUser(int userID, String name);
    public void post(int userID, int postID, String content);
    public void follow(int followerID, int followeeID);
    public void unfollow(int followerID, int followeeID);
    public void deletePost(int postID);

    public List<Integer> getNewsFeed(int userID);
    public List<Integer> getNewsFeedPaginated(Integer userID, Integer pageNumber);
}
