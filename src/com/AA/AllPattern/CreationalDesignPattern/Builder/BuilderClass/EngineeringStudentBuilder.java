package com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("DSA");
        list.add("DS");
        list.add("Computer Architecture");

        this.subject_list = list;
        return this;
    }
}
