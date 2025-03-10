package com.I.CompositeDesignPattern.Solution1ForFileSystem;


public class Main {
    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMoivieDirectory = new Directory("ComedyMovie");
        FileSystem hulchul = new File("HulChul");
        comedyMoivieDirectory.add(hulchul);

        movieDirectory.add(comedyMoivieDirectory);
        movieDirectory.ls();
    }
}
