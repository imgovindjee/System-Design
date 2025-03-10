package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userID;
    private String username;
    private String email;
    private int reputation;
    private List<Question> questionList;
    private List<Answer> answerList;
    private List<Comment> commentList;

    private static final int QUESTION_REPUTATION = 5;
    private static final int ANSWER_REPUTATION = 10;
    private static final int COMMENT_REPUTATION = 2;

    public User(int userID, String username, String email) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.answerList = new ArrayList<>();
        this.commentList = new ArrayList<>();
        this.questionList = new ArrayList<>();
        this.reputation = 0;
    }

    public int getUserID() {
        return userID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getReputation() {
        return reputation;
    }
    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
    public List<Question> getQuestionList() {
        return questionList;
    }
    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
    public List<Answer> getAnswerList() {
        return answerList;
    }
    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
    public List<Comment> getCommentList() {
        return commentList;
    }
    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }


    public synchronized Question askQuestion(String title, String content, List<String> tags){
        Question question = new Question(this, title, content, tags);
        questionList.add(question);
        updateReputation(QUESTION_REPUTATION);
        return question;
    }

    public synchronized Answer answerQuestion(Question question, String content){
        Answer answer = new Answer(this, question, content);
        answerList.add(answer);
        question.addAnswer(answer);
        updateReputation(ANSWER_REPUTATION);
        return answer;
    }

    public synchronized Comment addComment(Commentable commentable, String  content){
        Comment comment = new Comment(this, content);
        commentList.add(comment);
        commentable.addComment(comment);
        updateReputation(COMMENT_REPUTATION);
        return comment;
    }

    public synchronized void updateReputation(int value){
        this.reputation += value;
        if (this.reputation < 0){
            this.reputation = 0;
        }
    }
}
