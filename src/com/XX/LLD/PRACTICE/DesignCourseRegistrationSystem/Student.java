package com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem;

import java.util.List;

public class Student {

    private String studentID;
    private String studentName;
    private String email;
    private List<Course> registeredCourses;

    public Student(String studentID, String studentName, String email, List<Course> registeredCourses) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.email = email;
        this.registeredCourses = registeredCourses;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }
}
