package com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem;

import java.sql.Timestamp;

public class Registration {

    private Student student;
    private Course course;
    private Timestamp registration_time;

    public Registration(Student student, Course course, Timestamp registration_time) {
        this.student = student;
        this.course = course;
        this.registration_time = registration_time;
    }
}
