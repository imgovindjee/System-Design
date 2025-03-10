package com.K.BuilderDesignPattern.BuilderClass;

import com.K.BuilderDesignPattern.BuilderClass.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubject() {
        List<String> subject_list = new ArrayList<>();
        subject_list.add("DSA");
        subject_list.add("DS");
        subject_list.add("Computer Architecture");

        this.list_subject = subject_list;
        return this;
    }
}
