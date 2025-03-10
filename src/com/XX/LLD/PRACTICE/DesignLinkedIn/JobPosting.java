package com.XX.LLD.PRACTICE.DesignLinkedIn;

import java.sql.Timestamp;
import java.util.List;

public class JobPosting {

    private String jobID;
    private String jobTitle;
    private String description;
    private List<String> requirement;
    private String location;
    private Timestamp postDate;

    public JobPosting(String jobID, String jobTitle, String description, List<String> requirement, String location, Timestamp postDate) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.description = description;
        this.requirement = requirement;
        this.location = location;
        this.postDate = postDate;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getRequirement() {
        return requirement;
    }

    public void setRequirement(List<String> requirement) {
        this.requirement = requirement;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getPostDate() {
        return postDate;
    }

    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }
}
