package com.K.BuilderDesignPattern;

import com.K.BuilderDesignPattern.BuilderClass.StudentBuilder;

import java.util.List;

public class Student {

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> list_subject;

//    CONSTRUCTOR
    public Student(StudentBuilder studentBuilder) {
        this.list_subject = studentBuilder.list_subject;
        this.motherName = studentBuilder.motherName;
        this.fatherName = studentBuilder.fatherName;
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
    }

    public String toString(){
        return "" + "roll no: " + this.rollNumber +
                " \nage: " + this.age +
                " \nname: " + this.name +
                " \nfather name: " + this.fatherName +
                " \nmother name: " + this.motherName +
                " \nsubjects: " + list_subject.get(0) + "," + list_subject.get(1) + "," +list_subject.get(2);
    }
}
