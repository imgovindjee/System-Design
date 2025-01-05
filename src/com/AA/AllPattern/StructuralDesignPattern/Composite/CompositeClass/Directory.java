package com.AA.AllPattern.StructuralDesignPattern.Composite.CompositeClass;

import com.AA.AllPattern.StructuralDesignPattern.Composite.Component.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    List<FileSystem> fileSystemList = new ArrayList<>();
    public void addFile(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        for(FileSystem fsl:fileSystemList){
            fsl.ls();
        }
    }
}
