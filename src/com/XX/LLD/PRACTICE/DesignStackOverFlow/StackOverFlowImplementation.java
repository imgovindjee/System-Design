package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.Arrays;
import java.util.List;

public class StackOverFlowImplementation {
    public static void run(){
//        Object creation
//        StackOverFlow stackOverFlow = new StackOverFlow();
        StackOverFlow stackOverFlow = StackOverFlow.getInstance();

//        Create User
        User alice = stackOverFlow.createUser("Alice", "alice@gmail.com");
        User bob = stackOverFlow.createUser("Bob", "bob@gmail.com");
        User ash = stackOverFlow.createUser("Ash", "ash@gmail.com");



//        Alice ask Question
        Question aliceJavaQuestion = stackOverFlow.askQuestion(alice, "What is Polymorphism in Java?", "Can Someone Explain polymorphism in Java with an Example?", Arrays.asList("Java", "OOPS"));
        Question aliceRandomQuestion = stackOverFlow.askQuestion(alice, "What is HashSet and TreeSet in Java?", "Someone Explain HashSet and TreeSet in Java in Detail with some Examples?", Arrays.asList("Java", "Set", "Programming"));

//        Bob answer Question
        Answer bobAnswer = stackOverFlow.answerQuestion(bob, aliceJavaQuestion, "Polymorphism in Java is the ability of an object to take on many forms...");

//        ash commented on Question
        stackOverFlow.addComment(ash, aliceJavaQuestion, "Great question! I'm also interested in learning about this.");
        stackOverFlow.addComment(ash, aliceRandomQuestion, "Great question! I'm also interested to know about this.");

//        Alice commented on Bob Answer
        stackOverFlow.addComment(alice, bobAnswer, "Thanks for the explanation! Could you provide a code example?");

//        Ash voted the question and answer
//        UPVOTE
        stackOverFlow.voteQuestion(ash, aliceJavaQuestion, 1);
        stackOverFlow.voteAnswer(ash, bobAnswer, 1);

//        Bob voted the question
//        UPVOTE
        stackOverFlow.voteQuestion(bob, aliceRandomQuestion, 1);

//        Alice accept Bob answer
        stackOverFlow.acceptAnswer(bobAnswer);



        // Bob asks another question
        Question bobPythonQuestion = stackOverFlow.askQuestion(bob, "How to use list comprehensions in Python?", "I'm new to Python and I've heard about list comprehensions. Can someone explain how to use them?", Arrays.asList("python", "list-comprehension"));

        // Alice answers Bob's question
        Answer aliceAnswer = stackOverFlow.answerQuestion(alice, bobPythonQuestion, "List comprehensions in Python provide a concise way to create lists...");

        // Ash votes on Bob's question and Alice's answer
//        UPVOTE
        stackOverFlow.voteQuestion(ash, bobPythonQuestion, 1);
        stackOverFlow.voteAnswer(ash, aliceAnswer, 1);

//        Print out the current State
        System.out.println("Question: "+aliceJavaQuestion.getTitle());
        System.out.println("Asked by: "+aliceJavaQuestion.getAuthor().getUsername());
        System.out.println("Tags: "+aliceJavaQuestion.getTagList().stream().map(Tag::getName).reduce((a, b)->a +", "+b).orElse(""));
        System.out.println("Votes: "+aliceJavaQuestion.getVoteCount());
        System.out.println("Comments: "+aliceJavaQuestion.getComments().size());
        System.out.println("\nAnswer BY @"+bobAnswer.getAuthor().getUsername()+":");
        System.out.println(bobAnswer.getContent());
        System.out.println("Votes: "+bobAnswer.getVoteCount());
        System.out.println("Accepted: "+bobAnswer.isAccepted());
        System.out.println("Comments: "+bobAnswer.getComments().size());

//        User Reputation
        System.out.println("\n---------------User Reputations----------------");
        System.out.println("Alice: " + alice.getReputation());
        System.out.println("Bob: " + bob.getReputation());
        System.out.println("Ash: " + ash.getReputation());

//        Search functionality
        System.out.println("\n--------------Search Result for 'Java'----------------");
        showSearchResults(stackOverFlow, "java");
        System.out.println("\n--------------Search Result for 'Python'----------------");
        showSearchResults(stackOverFlow, "python");

//        Getting Question By User
        gettingQuestionsByUser(stackOverFlow, alice);
        gettingQuestionsByUser(stackOverFlow, bob);
        gettingQuestionsByUser(stackOverFlow, ash);
    }

    private static void showSearchResults(StackOverFlow stackOverFlow, String query){
        List<Question> searchResult = stackOverFlow.searchQuestion(query);
        for (Question question: searchResult){
            System.out.println(question.getTitle());
        }
    }

    private static void gettingQuestionsByUser(StackOverFlow stackOverFlow, User user){
        System.out.println("\n--------------- @"+user.getUsername()+" Question-----------------");
        List<Question> userQuestion = stackOverFlow.getQuestionByUser(user);
        for (Question question: userQuestion){
            System.out.println(question.getTitle());
        }
    }
}
