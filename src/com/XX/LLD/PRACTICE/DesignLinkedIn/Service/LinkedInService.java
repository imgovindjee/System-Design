package com.XX.LLD.PRACTICE.DesignLinkedIn.Service;

import com.XX.LLD.PRACTICE.DesignLinkedIn.*;
import com.XX.LLD.PRACTICE.DesignLinkedIn.Notification.Notification;
import com.XX.LLD.PRACTICE.DesignLinkedIn.Notification.NotificationType;
import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.Connection;
import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedInService {

    private static LinkedInService linkedInService;
    private Map<String, User> userMap;
    private Map<String, JobPosting> jobPostingMap;
    private Map<String, List<Notification>> notificationMap;

    private LinkedInService(){
        this.jobPostingMap = new ConcurrentHashMap<>();
        this.userMap = new ConcurrentHashMap<>();
        this.notificationMap = new ConcurrentHashMap<>();
    }

    public static synchronized LinkedInService getInstance(){
        if(linkedInService == null){
            linkedInService = new LinkedInService();
        }
        return linkedInService;
    }

    public void registerUser(User user){
        userMap.put(user.getUserID(), user);
    }

    public User loginUser(String email, String password){
        for (User user: userMap.values()){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public void updateUserProfile(User user){
        userMap.put(user.getUserID(), user);
    }

    public void sendConnectionRequest(User sender, User receiver){
        Connection connection = new Connection(sender, new Timestamp(System.currentTimeMillis()));
        receiver.getConnectionList().add(connection);

        Notification notification = new Notification(generateNotificationID(), receiver, NotificationType.CONNECTION_REQUEST, "New Connection request from "+sender.getUsername(), new Timestamp(System.currentTimeMillis()));
        addNotification(receiver.getUserID(), notification);
    }

    public void acceptConnectionRequest(User user, User connectionUser){
        for (Connection connection: user.getConnectionList()){
            if (connection.getUser().equals(connectionUser)){
                user.getConnectionList().add(new Connection(connectionUser, new Timestamp(System.currentTimeMillis())));
                break;
            }
        }
    }

    public List<User> searchUser(String key){
        List<User> userList = new ArrayList<>();
        for (User user:userMap.values()){
            if (user.getUsername().contains(key)){
                userList.add(user);
            }
        }
        return userList;
    }

    public void postJobListing(JobPosting jobPosting){
        jobPostingMap.put(jobPosting.getJobID(), jobPosting);
        for (User user:userMap.values()){
            Notification notification = new Notification(generateNotificationID(), user, NotificationType.JOB_POSTING, "New Job posting: "+jobPosting.getJobTitle(), new Timestamp(System.currentTimeMillis()));
            addNotification(user.getUserID(), notification);
        }
    }

    public List<JobPosting> searchJobPosting(String key){
        List<JobPosting> jobPostingList = new ArrayList<>();
        for (JobPosting jobPosting: jobPostingMap.values()){
            if (jobPosting.getJobTitle().contains(key) || jobPosting.getDescription().contains(key)){
                jobPostingList.add(jobPosting);
            }
        }
        return jobPostingList;
    }

    public void sendMessage(User sender, User receiver, String content){
        Message message = new Message(generateMessageID(), sender, receiver, content, new Timestamp(System.currentTimeMillis()));
        receiver.getInbox_messageList().add(message);
        sender.getSent_messageList().add(message);

        Notification notification = new Notification(generateNotificationID(), receiver, NotificationType.MESSAGE, "New Message from "+sender.getUsername(), new Timestamp(System.currentTimeMillis()));
        addNotification(receiver.getUserID(), notification);
    }

    public List<Notification> getNotification(String userID){
        return notificationMap.getOrDefault(userID, new ArrayList<>());
    }




    private String generateNotificationID(){
        return UUID.randomUUID().toString();
    }

    private void addNotification(String ID, Notification notification){
        notificationMap.computeIfAbsent(ID, k->new CopyOnWriteArrayList<>()).add(notification);
    }

    private String generateMessageID(){
        return UUID.randomUUID().toString();
    }
}
