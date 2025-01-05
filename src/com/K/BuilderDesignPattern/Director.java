package com.K.BuilderDesignPattern;

import com.K.BuilderDesignPattern.BuilderClass.EngineeringStudentBuilder;
import com.K.BuilderDesignPattern.BuilderClass.MBAStudentBuilder;
import com.K.BuilderDesignPattern.BuilderClass.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;

//    CONSTRUCTOR
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("QWERTY").setSubject().build();
    }

    public Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("ASDFG").setFatherName("Father").setMotherName("Mother").setSubject().build();
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }
}
