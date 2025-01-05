package com.XX.LLD.PRACTICE.DesignBookMyShow.Movie;

import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<City, List<Movie>>  city_movie;
    List<Movie> movieList;

//    CONSTRUCTOR
    public MovieController(){
        city_movie = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        movieList.add(movie);

        List<Movie> list = city_movie.getOrDefault(city, new ArrayList<>());
        list.add(movie);
        city_movie.put(city, list);
    }

//    GET MOVIES BY NAME
    public Movie getMovieByName(String movieName){
        for(Movie movie:movieList){
            if((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

//    GET MOVIES IN THE PARTICULAR CITY
    public List<Movie> getMoviesByCity(City city) {
        return city_movie.get(city);
    }

//    REMOVE MOVIE FROM THE PARTICULAR CITY
//    UPDATE movie of a particular city, make use of cityVsMovies map
//    CRUD operation based on Movie ID, make use of allMovies list
}
