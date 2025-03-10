package com.K.BuilderDesignPattern;

import com.K.BuilderDesignPattern.BuilderClass.EngineeringStudentBuilder;
import com.K.BuilderDesignPattern.BuilderClass.MBAStudentBuilder;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = director1.createEngineeringStudent();
        Student MBAStudent = director2.createMBAStudent();

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println(engineeringStudent.toString());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println(MBAStudent.toString());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
}
