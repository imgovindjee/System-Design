package com.AA.AllPattern.CreationalDesignPattern.Prototype.Problem;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(20, "QWERTY", 59);

//        creating a clone
        Student student_clone = new Student();
        student_clone.name = student.name;
        student_clone.age = student.age;
//        student_clone.rollNumber = student.rollNumber; //PROBLEM " Can't access the PRIVATE CLASS, MEMBERS"
    }
}
