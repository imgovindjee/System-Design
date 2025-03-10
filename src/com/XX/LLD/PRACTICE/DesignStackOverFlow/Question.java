package com.XX.LLD.PRACTICE.DesignStackOverFlow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Votable, Commentable{

    private final int questionID;
    private String title;
    private String content;
    private User author;
    private final Date creationDate;
    private List<Answer> answerList;
    private List<Comment> commentList;
    private List<Tag> tagList;
    private List<Vote> voteList;

    public Question(User user, String title, String content, List<String> tagsName) {
        this.questionID = generateID();
        this.title = title;
        this.content = content;
        this.author = user;
        this.creationDate = new Date();
        this.answerList = new ArrayList<>();
        this.commentList = new ArrayList<>();
        this.voteList = new ArrayList<>();
        this.tagList = new ArrayList<>();

        for (String tagName: tagsName){
            this.tagList.add(new Tag(tagName));
        }
    }

    public int getQuestionID() {
        return questionID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public Date getCreationDate() {
        return creationDate;
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
    public List<Tag> getTagList() {
        return tagList;
    }
    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
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
            throw new IllegalArgumentException("Vote value must be either 1 or -1");
        }

        voteList.removeIf(v->v.getUser().equals(user));
        voteList.add(new Vote(user, value));
        author.updateReputation(value*5);
    }

    @Override
    public int getVoteCount() {
        return voteList.stream().mapToInt(Vote::getValue).sum();
    }

    public void addAnswer(Answer answer){
        if (!answerList.contains(answer)){
            answerList.add(answer);
        }
    }

    private int generateID(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
