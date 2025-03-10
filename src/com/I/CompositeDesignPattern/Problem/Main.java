package com.I.CompositeDesignPattern.Problem;

public class Main {
    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("HulChul");
        comedyMovieDirectory.add(hulchul);

        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.ls();
    }
}
