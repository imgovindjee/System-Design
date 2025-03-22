package com.XX.LLD.PRACTICE.DesignLinkedIn.ServiceImplementation;

import com.XX.LLD.PRACTICE.DesignLinkedIn.JobPosting;
import com.XX.LLD.PRACTICE.DesignLinkedIn.Notification.Notification;
import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.Profile;
import com.XX.LLD.PRACTICE.DesignLinkedIn.Service.LinkedInService;
import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedInServiceImplementation {

    static LinkedInService linkedInService;

    public static void run(){
//        Instance creation
        linkedInService = LinkedInService.getInstance();

//        User registration
        User user1 = new User("U1", "QWERTY", "qwerty@gmail.com", "password", new Profile(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        User user2 = new User("U2", "John Doe", "john@gmail.com", "password", new Profile(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        User user3 = new User("U3", "Priyanka", "priyanka@gmail.com", "password", new Profile(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        linkedInService.registerUser(user1);
        linkedInService.registerUser(user2);
        linkedInService.registerUser(user3);

//        User Logged In
        User loggedInUser = linkedInService.loginUser("priyanka@gmail.com", "password");
        if (loggedInUser != null){
            System.out.println("User logged in: @"+loggedInUser.getUsername());
        } else {
            System.out.println("Invalid email or password");
        }

//        Update user profile
        Profile profile = new Profile();
        profile.setHeadline("SDE");
        profile.setSummary("Passionate about coding and problem solving");

        loggedInUser.setProfile(profile);
        linkedInService.updateUserProfile(loggedInUser);

//        Send connection request
        linkedInService.sendConnectionRequest(user3, user2);
        linkedInService.sendConnectionRequest(user1, user3);

//        Accept connection request
        linkedInService.acceptConnectionRequest(user2, user3);
        linkedInService.acceptConnectionRequest(user3, user1);

//        Listing a jobPost
        JobPosting jobPosting1 = new JobPosting("J1", "SDE", "We are hiring", Arrays.asList("Java", "Python", "Go"), "London", new Timestamp(System.currentTimeMillis()));
        JobPosting jobPosting2 = new JobPosting("J2", "Software Developer", "We are hiring a Software Engineer/Developer", Arrays.asList("Java", "Swift", "Python", "Rust"), "USA - San Francisco", new Timestamp(System.currentTimeMillis()));
        linkedInService.postJobListing(jobPosting1);
        linkedInService.postJobListing(jobPosting2);

//        Search for users
        System.out.println("\n--------------Searching User Results----------------");
        displaySearchResults("n");

//        Search for Job Posting
        System.out.println("\n------------Searching for Job Post-------------------");
        displayJobPosting("S");

//        Send a Message
        linkedInService.sendMessage(user1, user3, "Hii priyanka, Hope you're doing well");
        linkedInService.sendMessage(user3, user2, "Hii john, How yours day.");

//        Get Notification
        displayNotification(user1);
        displayNotification(user2);
        displayNotification(user3);
    }



    private static void displaySearchResults(String key){
        List<User> searchUser = linkedInService.searchUser(key);
        for (User user:searchUser){
            System.out.println("Name: "+user.getUsername());
            System.out.println("Headline: "+user.getProfile().getHeadline());
            System.out.println();
        }
    }

    private static void displayJobPosting(String key){
        List<JobPosting> jobPostingList = linkedInService.searchJobPosting(key);
        for (JobPosting jobPosting: jobPostingList){
            System.out.println("Title: "+jobPosting.getJobTitle());
            System.out.println("Description: "+jobPosting.getDescription());
            System.out.println();
        }
    }

    private static void displayNotification(User user){
        List<Notification> notificationsList = linkedInService.getNotification(user.getUserID());
        System.out.println("\n----------------Notification for the user with userID: "+user.getUserID()+" -----------------");
        for (Notification notification: notificationsList){
            System.out.println("Type: "+notification.getNotificationType());
            System.out.println("Content: "+notification.getContent());
            System.out.println();
        }
    }
}
