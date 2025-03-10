package com.I.CompositeDesignPattern.Solution1ForFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String dir_name;
    List<FileSystem> fileSystemList;

    public Directory(String dir_name) {
        this.dir_name = dir_name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name is: "+dir_name);
        for(FileSystem fsl: fileSystemList){
            fsl.ls();
        }
    }
}
