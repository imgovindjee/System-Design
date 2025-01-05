package com.AA.AllPattern.CreationalDesignPattern.Builder;

import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.StudentBuilder;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subject_List;

    public Student(StudentBuilder studentBuilder){
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.name = studentBuilder.name;
        this.rollNumber = studentBuilder.rollNumber;
        this.subject_List = studentBuilder.subject_list;
    }

    public String toString() {
        return "" + "Roll Number: " +this.rollNumber +
                "\nage: " + this.age +
                "\nname: " + this.name +
                "\nfather name: " + this.fatherName +
                "\nmother name: " + this.motherName +
                "\nsubject list: " + subject_List.get(0) + ", " + subject_List.get(1) + ", " + subject_List.get(2);
    }
}
