package com.AA.AllPattern.CreationalDesignPattern.Builder.BuilderClass;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("MICRO ECONOMICS");
        list.add("BUSINESS STUDIES");
        list.add("MANAGEMENT");

        this.subject_list = list;
        return this;
    }
}
