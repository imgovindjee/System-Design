package com.AA.AllPattern.CreationalDesignPattern.Prototype.UsingPrototypePattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(20, 89, "QWERTY");
        Student student_clone = (Student) student.clone();
        System.out.println("Name: " +student_clone.name + "\nAge: "+student_clone.age);
    }
}
