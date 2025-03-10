package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.NotFoundException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.ScreenAlreadyOccupiedException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Movie;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Screen;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;

import java.util.*;

public class ShowService {

    private Map<String, Show> shows;

    public ShowService(){
        this.shows = new HashMap<>();
    }

    /**
     *
     * @param showID  unique show-id
     * @return  return type {@Show}
     */
    public Show getShow(String showID){
        if(!shows.containsKey(showID)){
            System.out.println("");
//            throw new NotFoundException();
        }
        return shows.get(showID);
    }

    /**
     * CREATE A SHOW
     *
     * @param movie  WHICH MOVE IS IN THE THEATRE
     * @param screen  IN WHICH SCREEN THAT MOVIE IS RUNNING
     * @param startTime  STARTING TIME OF THAT MOVIE
     * @param durationInSecond  TOTAL DURATION OF MOVIE
     * @return  RETURN THAT {@show}
     */
    public Show createShow(Movie movie, Screen screen, Date startTime, int durationInSecond){
        if(checkIfShowCreationAllowed(screen, startTime, durationInSecond)){
            System.out.println("");
//            throw new ScreenAlreadyOccupiedException();
        }

        String showID = UUID.randomUUID().toString();
        Show show = new Show(showID, movie, screen, startTime, durationInSecond);
        this.shows.put(showID, show);
        return show;
    }

    public List<Show> getShowsForScreen(Screen screen){
        List<Show> showList = new ArrayList<>();
        for(Show show:shows.values()){
            if(show.getScreen().equals(screen)){
                showList.add(show);
            }
        }
        return showList;
    }

    /**
     * checks if the show creation is allowed or not
     *
     * @param screen  IN WHICH SCREEN THAT MOVIE IS RUNNING
     * @param startTime  STARTING TIME OF THAT MOVIE
     * @param durationInSecond TOTAL DURATION OF MOVIE
     * @return  {@Boolean}
     */
    private boolean checkIfShowCreationAllowed(Screen screen, Date startTime, int durationInSecond){
        return true;
    }
}
