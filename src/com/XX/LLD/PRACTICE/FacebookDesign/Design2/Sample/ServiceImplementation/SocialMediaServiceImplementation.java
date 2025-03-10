package com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.ServiceImplementation;

import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Comments;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Notification.Notification;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Post;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Service.SocialMediaService;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaServiceImplementation {
    public static void main(String[] args){
//        Service Instance creation
        SocialMediaService socialMediaService = SocialMediaService.getInstance();

//        user Reg
        User user1 = new User("1", "QWERTY", "qwerty@gmail.com", "password", "---BIO-X---", "profilepicture1.jpg", new ArrayList<>(), new ArrayList<>());
        User user2 = new User("2", "John Doe", "john@gmail.com", "password", "---BIO-Y---", "profilepicture2.jpg", new ArrayList<>(), new ArrayList<>());
        socialMediaService.registerUser(user1);
        socialMediaService.registerUser(user2);
        System.out.println("---------------------------------------------------------------");

//        user login
        User loggedInUser = socialMediaService.loginUser("qwerty@gmail.com", "password");
        if(loggedInUser != null){
            System.out.println("User Logged in @"+loggedInUser.getUsername());
        } else {
            System.out.println("Invalid email or password");
        }

//        Send Friend Req
        socialMediaService.sendFriendRequest(user1.getUserID(), user2.getUserID());

//        Accept friend Req
        socialMediaService.acceptFriendRequest(user2.getUserID(), user1.getUserID());

//        create posts
        Post post1 = new Post("p1", user1.getUserID(), "My First Post-1 by user-1", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Timestamp(System.currentTimeMillis()));
        Post post2 = new Post("p2", user2.getUserID(), "My First Post-1 by user-2", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Timestamp(System.currentTimeMillis()));
        Post post3 = new Post("p3", user1.getUserID(), "My Second Post-2 by user-1", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Timestamp(System.currentTimeMillis()));
        socialMediaService.createPost(post1);
        socialMediaService.createPost(post2);
        socialMediaService.createPost(post3);

//        Like pos
        socialMediaService.likePost(user2.getUserID(), post1.getPostID());
        socialMediaService.likePost(user2.getUserID(), post3.getPostID());

//        comment on post
        Comments comments1 = new Comments("c1", user2.getUserID(), post1.getPostID(), "Great!!!", new Timestamp(System.currentTimeMillis()));
        socialMediaService.commentOnPost(comments1);

//        Get news Feed
        List<Post> newsFeed = socialMediaService.getNewsFeed(user2.getUserID());
        System.out.println("\n--------------------------News Feed----------------------------------");
        for (Post post:newsFeed){
            System.out.println("Post: "+post.getContent());
            System.out.println("Likes: "+post.getLikes());
            System.out.println("Comments: "+post.getComments());
            System.out.println();
        }

//        Get Notifications
        List<Notification> notifications = socialMediaService.getNotification(user1.getUserID());
        System.out.println("\n---------------------------Notifications-------------------------------------");
        for (Notification notification: notifications){
            System.out.println("Type: "+notification.getNotificationType());
            System.out.println("Content: "+notification.getContent());
            System.out.println();
        }
    }
}
