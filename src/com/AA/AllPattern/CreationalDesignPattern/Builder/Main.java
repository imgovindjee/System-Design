package com.AA.AllPattern.CreationalDesignPattern.Builder;

import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.EngineeringStudentBuilder;
import com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass.MBAStudentBuilder;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println("-------------------------------------------------------------------");
        System.out.println(engineerStudent.toString());
        System.out.println("-------------------------------------------------------------------");
        System.out.println(mbaStudent.toString());
        System.out.println("-------------------------------------------------------------------");
    }
}
