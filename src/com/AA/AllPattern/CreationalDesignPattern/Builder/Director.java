package com.AA.AllPattern.CreationalDesignPattern.Builder;

import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.EngineeringStudentBuilder;
import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.MBAStudentBuilder;
import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.StudentBuilder;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else {
            return null;
        }
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(2).setAge(22).setName("QWERTY").setSubjects().build();
    }

    public Student createMBAStudent() {
        return studentBuilder.setRollNumber(3).setAge(19).setName("PRIYANKA").setFatherName("FATHER").setMotherName("MOTHER").setSubjects().build();
    }
}
