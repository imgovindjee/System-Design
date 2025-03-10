package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Facebook;

import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities.Post;
import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class FacebookServiceImplementation implements FacebookService{

    private FaceBook faceBook;

    public FacebookServiceImplementation(){
        this.faceBook = FaceBook.getInstance();
    }


    @Override
    public void addUser(int userID, String name) {
        User user = new User(userID, name);
        faceBook.getUserMap().put(userID, user);
    }

    @Override
    public void post(int userID, int postID, String content) {
        if(!checkUser(userID)){
            System.out.println("-------------------------------------------------\n" +
                    "USER IS NOT AVAILABLE" +
                    "\n---------------------------------------------------------------");
            return;
        } else {
            Post post = new Post(postID, userID, content);

            faceBook.getPostMap().put(postID, post);
            faceBook.getUserMap().get(userID).getUserPostID().add(postID);
            System.out.println("-------------------------------------------------\n" +
                    "{@"+faceBook.getUserMap().get(userID).getName()+"}, Just posted a content.");
        }
    }

    @Override
    public void follow(int followerID, int followeeID) {
        if(!checkUser(followeeID) || !checkUser(followeeID)){
            System.out.println("-------------------------------------------------\n" +
                    "USER IS NOT AVAILABLE" +
                    "\n---------------------------------------------------------------");
            return;
        }
        if(checkIsFollowing(followerID, followeeID)){
            System.out.println("----------------------------------------------------\n" +
                    "{@"+faceBook.getUserMap().get(followerID).getName()+"} already follows {@"+faceBook.getUserMap().get(followeeID).getName()+"}" +
                    "\n----------------------------------------------------");
            return;
        }

        faceBook.getUserMap().get(followerID).getFollowed().add(followeeID);
        System.out.println("----------------------------------------------------\n" +
                "{@"+faceBook.getUserMap().get(followerID).getName()+"} started following {@"+faceBook.getUserMap().get(followeeID).getName()+"}" +
                "\n----------------------------------------------------");
    }

    @Override
    public void unfollow(int followerID, int followeeID) {
        if(!checkUser(followeeID) || !checkUser(followeeID)){
            System.out.println("-------------------------------------------------\n" +
                    "USER IS NOT AVAILABLE" +
                    "\n---------------------------------------------------------------");
            return;
        }
        if(!checkIsFollowing(followerID, followeeID)){
            System.out.println("----------------------------------------------------\n" +
                    "{@"+faceBook.getUserMap().get(followerID).getName()+"} don't follows {@"+faceBook.getUserMap().get(followeeID).getName()+"}" +
                    "\n----------------------------------------------------");
            return;
        }

        faceBook.getUserMap().get(followerID).getFollowed().remove(followeeID);
        System.out.println("----------------------------------------------------\n" +
                "{@"+faceBook.getUserMap().get(followerID).getName()+"} unfollowed {@"+faceBook.getUserMap().get(followeeID).getName()+"}" +
                "\n----------------------------------------------------");
    }

    @Override
    public void deletePost(int postID) {
        if(!faceBook.getPostMap().containsKey(postID)){
            System.out.println("---------------------------------------------------------\n" +
                    "POST NOT AVAILABLE" +
                    "\n---------------------------------------------------------");
            return;
        } else {
            Post post = faceBook.getPostMap().get(postID);

            faceBook.getPostMap().remove(postID);
            faceBook.getUserMap().get(post.getUserID()).getUserPostID().remove(postID);
            System.out.println("---------------------------------------------------------\n" +
                    "POST DELETED SUCCESSFULLY" +
                    "\n---------------------------------------------------------");
        }
    }

    @Override
    public List<Integer> getNewsFeed(int userID) {
        return getTopNPosts(userID, 10);
    }

    @Override
    public List<Integer> getNewsFeedPaginated(Integer userID, Integer pageNumber) {
        List<Integer> newsfeed_list = getTopNPosts(userID, 10);
        return newsfeed_list.subList((pageNumber-1)*faceBook.getPageSize(), (pageNumber)*faceBook.getPageSize()-1);
    }


    private boolean checkUser(Integer userID){
        return faceBook.getUserMap().get(userID) != null;
    }

    private boolean checkIsFollowing(int followerID, int followeeID){
        return faceBook.getUserMap().get(followerID).getFollowed().contains(followeeID);
    }

    private List<Integer> getTopNPosts(Integer userID, Integer N){
        Set<Integer> following = faceBook.getUserMap().get(userID).getFollowed();
        PriorityQueue<Post> pq = new PriorityQueue<>(
                (a, b) -> b.getCreatedAt()-a.getCreatedAt());
        for(Integer f:following){
            for(Integer post:faceBook.getUserMap().get(f).getUserPostID()){
                Post p = faceBook.getPostMap().get(post);
                pq.add(p);
            }
        }

        List<Integer> postList = new ArrayList<>();
        for(int i=0; i<N; i++){
            if(!pq.isEmpty()) {
                postList.add(pq.poll().getPostID());
            }
        }
        return postList;
    }
}
