package com.AA.AllPattern.StructuralDesignPattern.Composite.Leaf;

import com.AA.AllPattern.StructuralDesignPattern.Composite.Component.FileSystem;

public class File implements FileSystem {
    @Override
    public void ls() {
        System.out.println("---------------------------------------------------" +
                "\nFile named is XYZ\n"+
                "----------------------------------------------------");
//        BUSINESS LOGIC HERE
    }
}
