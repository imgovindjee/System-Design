package com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Service;

import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Comments;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Notification.Notification;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Notification.NotificationType;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Post;
import com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SocialMediaService {

    private static SocialMediaService socialMediaService;
    private Map<String, User> userMap;
    private Map<String, Post> postMap;
    private Map<String, List<Notification>> notificationMap;

    private SocialMediaService(){
        this.userMap = new ConcurrentHashMap<>();
        this.notificationMap = new ConcurrentHashMap<>();
        this.postMap = new ConcurrentHashMap<>();
    }

    public static synchronized SocialMediaService getInstance(){
        if(socialMediaService==null){
            socialMediaService = new SocialMediaService();
        }
        return socialMediaService;
    }

    public void registerUser(User user){
        userMap.put(user.getUserID(), user);
        System.out.println("A new user has been register {@"+user.getUsername()+"}");
    }

    public User loginUser(String email, String password){
        for (User value:userMap.values()){
            if(value.getEmail().equals(email) && value.getPassword().equals(password)){
                return value;
            }
        }
        return null;
    }

    public void updateUserProfile(User user){
        userMap.put(user.getUserID(), user);
    }

    public void sendFriendRequest(String senderID, String receiverID){
        User receiver = userMap.get(receiverID);
        if(receiver != null){
            Notification notification = new Notification(generateNotificationID(), receiverID, NotificationType.FRIEND_REQUEST, "Friend Request From "+senderID, new Timestamp(System.currentTimeMillis()));
            addNotification(receiverID, notification);
        }
    }

    public void acceptFriendRequest(String userID, String friendID){
        User user = userMap.get(userID);
        User friend = userMap.get(friendID);
        if(user != null && friend != null){
            user.getFriendList().add(friendID);
            friend.getFriendList().add(userID);

            Notification notification = new Notification(generateNotificationID(), friendID, NotificationType.FRIEND_REQUEST_ACCEPTED, "Friend Request Accepted by "+ userID, new Timestamp(System.currentTimeMillis()));
            addNotification(friendID, notification);
        }
    }

    public synchronized void createPost(Post post){
        postMap.put(post.getPostID(), post);
        User user = userMap.get(post.getUserID());
        if(user != null){
            user.getPostList().add(post);
        }
    }

    public List<Post> getNewsFeed(String userID){
        List<Post> newsFeed = new ArrayList<>();
        User user = userMap.get(userID);
        if(user != null){
            List<String> friendsID = user.getFriendList();
            for (String friendID:friendsID){
                User friend = userMap.get(friendID);
                if(friend != null){
                    newsFeed.addAll(friend.getPostList());
                }
            }

            newsFeed.addAll(user.getPostList());
            newsFeed.sort((a, b)->b.getTimestamp().compareTo(a.getTimestamp()));
        }
        return newsFeed;
    }

    public void likePost(String userID, String postID){
        Post post = postMap.get(postID);
        if(post != null && !post.getLikes().contains(userID)){
            post.getLikes().add(userID);

            Notification notification = new Notification(generateNotificationID(), post.getUserID(), NotificationType.LIKE, "Your Post was liked by "+userID, new Timestamp(System.currentTimeMillis()));
            addNotification(post.getUserID(), notification);
        }
    }

    public void commentOnPost(Comments comments){
        Post post = postMap.get(comments.getPostID());
        if(post != null){
            post.getComments().add(comments);

            Notification notification = new Notification(generateNotificationID(), post.getUserID(), NotificationType.COMMENT, "Your Post Receive Comment from "+comments.getUserID(), new Timestamp(System.currentTimeMillis()));
            addNotification(post.getUserID(), notification);
        }
    }

    private String generateNotificationID(){
        return UUID.randomUUID().toString();
    }

    private void addNotification(String userID, Notification notification){
        notificationMap.computeIfAbsent(userID, k->new CopyOnWriteArrayList<>()).add(notification);
        System.out.println(notification.getContent());
    }

    public List<Notification> getNotification(String userID){
        return notificationMap.getOrDefault(userID, new ArrayList<>());
    }
}
