package com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem;

public class Course {

    private String courseCode;
    private String courseName;
    private String courseInstructor;
    private int maxCourseCapacity;
    private int enrolledStudents;

    public Course(String courseCode, String courseName, String courseInstructor, int maxCourseCapacity, int enrolledStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.maxCourseCapacity = maxCourseCapacity;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public int getMaxCourseCapacity() {
        return maxCourseCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public void setMaxCourseCapacity(int maxCourseCapacity) {
        this.maxCourseCapacity = maxCourseCapacity;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
