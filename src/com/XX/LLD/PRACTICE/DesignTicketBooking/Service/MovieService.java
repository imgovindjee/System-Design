package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.NotFoundException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Movie;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MovieService {

    private Map<String, Movie> movies;

    public MovieService(){
        this.movies = new HashMap<>();
    }

    public Movie getMovie(String movieID){
        if (!movies.containsKey(movieID)) {
            System.out.println("");
//            throw new NotFoundException();
        }
        return movies.get(movieID);
    }

    public Movie createMovie(String movieName){
        String movieID = UUID.randomUUID().toString();
        Movie movie = new Movie(movieID, movieName);
        movies.put(movieID, movie);
        System.out.println("A new movie with movieID:"+movieID+" and movieName:"+movieName+" has been created");
        return movie;
    }
}
