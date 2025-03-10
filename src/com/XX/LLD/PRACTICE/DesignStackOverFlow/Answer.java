package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer implements Votable, Commentable{

    private final int answerID;
    private String content;
    private User author;
    private Question question;
    private boolean isAccepted;
    private final Date creationDate;
    private List<Comment> commentList;
    private List<Vote> voteList;

    public Answer(User author, Question question, String content) {
        this.answerID = generateID();
        this.content = content;
        this.author = author;
        this.question = question;
        this.creationDate = new Date();
        this.voteList = new ArrayList<>();
        this.commentList = new ArrayList<>();
        this.isAccepted = false;
    }

    public int getAnswerID() {
        return answerID;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public Question getQuestion() {
        return question;
    }
    public void setQuestion(Question question) {
        this.question = question;
    }
    public boolean isAccepted() {
        return isAccepted;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public List<Comment> getCommentList() {
        return commentList;
    }
    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
    public List<Vote> getVoteList() {
        return voteList;
    }
    public void setVoteList(List<Vote> voteList) {
        this.voteList = voteList;
    }



    @Override
    public void addComment(Comment comment) {
        commentList.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return new ArrayList<>(commentList);
    }

    @Override
    public void vote(User user, int value) {
        if (value != 1 && value != -1){
            throw new IllegalArgumentException("Vote must be either 1 or -1");
        }

        voteList.removeIf(v->v.getUser().equals(user));
        voteList.add(new Vote(user, value));
        author.updateReputation(value * 10);  // +10 or -10 to the reputation
    }

    @Override
    public int getVoteCount() {
        return voteList.stream().mapToInt(Vote::getValue).sum();
    }

    public void markAsAccepted(){
        if (isAccepted){
            throw new IllegalStateException("This answer is already accepted");
        }
        isAccepted = true;
        author.updateReputation(15);
    }

    private int generateID(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
