package com.K.BuilderDesignPattern.BuilderClass;

import com.K.BuilderDesignPattern.Student;
import java.util.List;

public abstract class StudentBuilder {
    public List<String> list_subject;
    public int rollNumber;
    public int age;
    public String name;
    public String fatherName;
    public String motherName;

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student build() {
        return new Student(this);
    }
}
