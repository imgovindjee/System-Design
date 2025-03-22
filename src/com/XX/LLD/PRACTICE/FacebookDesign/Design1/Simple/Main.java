package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple;

import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Facebook.FacebookService;
import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Facebook.FacebookServiceImplementation;

public class Main {
    public static void main(String [] args){
        FacebookService facebookService = new FacebookServiceImplementation();

        facebookService.addUser(1, "GANESH");
        facebookService.addUser(2, "PRIYANKA");
        facebookService.addUser(3, "QWERTY");
        facebookService.addUser(4, "SHREYA");
        facebookService.addUser(5, "SAMIKSHA");
        facebookService.addUser(6, "NIMRIT");

        facebookService.follow(1, 2);
        facebookService.follow(1, 3);
        facebookService.follow(1, 3);
        facebookService.follow(3, 1);
        facebookService.follow(6, 2);

        facebookService.post(1, 1001, "ABC");
        facebookService.post(1, 1002, "QWE");
        facebookService.post(2, 2001, "AWE");
        facebookService.post(3, 3001, "POU");
        facebookService.post(3, 3002, "ZXC");
        facebookService.post(4, 4001, "MNB");
        facebookService.post(5, 5001, "LKJ");
        facebookService.post(6, 6001, "MNO");

        facebookService.deletePost(1002);
        facebookService.deletePost(6001);

        System.out.println("\n" +
                "----------NEWSFEED POST LIST------------\n"+
                facebookService.getNewsFeed(1));
    }
}
