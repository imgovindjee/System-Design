package com.I.CompositeDesignPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String dir_name;
    List<Object> objectList;

    public Directory(String dir_name) {
        this.dir_name = dir_name;
        objectList = new ArrayList<>();
    }

    public void add(Object object){
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory name is "+dir_name);
        for(Object ol:objectList){
            if(ol instanceof File){
                ((File) ol).ls();
            } else if(ol instanceof Directory){
                ((Directory) ol).ls();
            }
        }
    }
}
