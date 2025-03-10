package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StackOverFlow {

    private static StackOverFlow stackOverFlow;
    private Map<Integer, User> userMap;
    private Map<Integer, Question> questionMap;
    private Map<Integer, Answer> answerMap;
    private Map<String, Tag> tagMap;

    public StackOverFlow(){
        this.answerMap = new ConcurrentHashMap<>();
        this.questionMap = new ConcurrentHashMap<>();
        this.tagMap = new ConcurrentHashMap<>();
        this.userMap = new ConcurrentHashMap<>();
    }

    public static synchronized StackOverFlow getInstance(){
        if (stackOverFlow == null){
            stackOverFlow = new StackOverFlow();
        }
        return stackOverFlow;
    }

    public User createUser(String username, String email){
        int userID = generateID();
        User user = new User(userID, username, email);
        userMap.put(userID, user);
        return user;
    }

    public User getUser(int userID){
        return userMap.get(userID);
    }

    public Question askQuestion(User user, String title, String content, List<String> tags){
        Question question = user.askQuestion(title, content, tags);
        questionMap.put(question.getQuestionID(), question);
        for (Tag tag: question.getTagList()){
            this.tagMap.putIfAbsent(tag.getName(), tag);
        }
        return question;
    }

    public Question getQuestion(int questionID){
        return questionMap.get(questionID);
    }

    public Answer answerQuestion(User user, Question question, String content){
        Answer answer = user.answerQuestion(question, content);
        answerMap.put(answer.getAnswerID(), answer);
        return answer;
    }

    public Answer getAnswer(int answerID){
        return answerMap.get(answerID);
    }

    public Tag getTag(String tagName){
        return tagMap.get(tagName);
    }

    public Comment addComment(User user, Commentable commentable, String content){
        return user.addComment(commentable, content);
    }

    public void voteQuestion(User user, Question question, int value){
        question.vote(user, value);
    }

    public void voteAnswer(User user, Answer answer, int value){
        answer.vote(user, value);
    }

    public void acceptAnswer(Answer answer){
        answer.markAsAccepted();
    }

    public List<Question> getQuestionByUser(User user){
        return user.getQuestionList();
    }

    public List<Question> searchQuestion(String query){
        return questionMap.values().stream()
                .filter(q->q.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                        q.getContent().toLowerCase().contains(query.toLowerCase()) ||
                        q.getTagList().stream().anyMatch(tl->tl.getName().equalsIgnoreCase(query)))
                .collect(Collectors.toList());
    }


    public Map<Integer, User> getUserMap() {
        return userMap;
    }
    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }
    public Map<Integer, Answer> getAnswerMap() {
        return answerMap;
    }
    public Map<String, Tag> getTagMap() {
        return tagMap;
    }

    private int generateID(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
