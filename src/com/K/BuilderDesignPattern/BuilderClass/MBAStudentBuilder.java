package com.K.BuilderDesignPattern.BuilderClass;

import com.K.BuilderDesignPattern.BuilderClass.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubject() {
        List<String> subject_list = new ArrayList<>();
        subject_list.add("Micro Economics");
        subject_list.add("Business Economics");
        subject_list.add("Operations Management");

        this.list_subject = subject_list;
        return this;
    }
}
