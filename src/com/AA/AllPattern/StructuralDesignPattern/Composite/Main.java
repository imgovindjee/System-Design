package com.AA.AllPattern.StructuralDesignPattern.Composite;

import com.AA.AllPattern.StructuralDesignPattern.Composite.Component.FileSystem;
import com.AA.AllPattern.StructuralDesignPattern.Composite.CompositeClass.Directory;
import com.AA.AllPattern.StructuralDesignPattern.Composite.Leaf.File;

public class Main {
    public static void main(String[] args) {
        Directory parentDirectory = new Directory();

        FileSystem fileSystem1 = new File();
        parentDirectory.addFile(fileSystem1);

        Directory childDirectory = new Directory();
        FileSystem fileSystem2 = new File();
        childDirectory.addFile(fileSystem2);
        parentDirectory.addFile(childDirectory);

        parentDirectory.ls();
    }
}
