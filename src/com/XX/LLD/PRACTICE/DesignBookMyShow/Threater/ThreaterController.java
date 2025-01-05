package com.XX.LLD.PRACTICE.DesignBookMyShow.Threater;

import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.City;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Movie.Movie;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreaterController {

    List<Threater> threaterList;
    Map<City, List<Threater>> city_threater;

//    CONSTRUCTOR
    public ThreaterController(){
        threaterList = new ArrayList<>();
        city_threater = new HashMap<>();
    }

    public void addThreater(Threater threater, City city) {
        threaterList.add(threater);

        List<Threater> value = city_threater.getOrDefault(city, new ArrayList<>());
        value.add(threater);
        city_threater.put(city, value);
    }

    public Map<Threater, List<Show>> getAllShows(Movie movie, City city) {
        Map<Threater, List<Show>> threater_show = new HashMap<>();

//        GETTING ALL THE THEATER IN THE CITY
        List<Threater> threaterList = city_threater.get(city);
//        FILTER THE THEATER
//        THAT RUNS THE SAME MOVIE [SHOW]
        for(Threater threater: threaterList) {
            List<Show> givenMovieShow = new ArrayList<>();
            List<Show> showList = threater.getShowList();

            for(Show show:showList){
                if(show.getMovie().getMovieID() == movie.getMovieID()){
                    givenMovieShow.add(show);
                }
            }
            if(!givenMovieShow.isEmpty()){
                threater_show.put(threater, givenMovieShow);
            }
        }
        return threater_show;
    }
}
