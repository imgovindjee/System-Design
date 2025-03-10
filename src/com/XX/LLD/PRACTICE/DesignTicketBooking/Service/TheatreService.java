package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.NotFoundException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Screen;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Theatre;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TheatreService {

    private Map<String, Theatre> theatres;
    private Map<String, Screen> screens;
    private Map<String, Seat> seats;

    /**
     * @Constructor
     */
    public TheatreService(){
        this.theatres = new HashMap<>();
        this.screens = new HashMap<>();
        this.seats = new HashMap<>();
    }

    public Seat getSeat(String seatID){
        return seats.get(seatID);
    }

    public Theatre getTheatre(String theatreID){
        if(!theatres.containsKey(theatreID)){
            System.out.println("");
//            throw new NotFoundException();
        }
        return theatres.get(theatreID);
    }

    public Screen getScreen(String screenID){
        if(!screens.containsKey(screenID)){
            System.out.println("");
//            throw new NotFoundException();
        }
        return screens.get(screenID);
    }

    public Theatre createTheatre(String theatreName){
        String theatreID = UUID.randomUUID().toString();
        Theatre theatre = new Theatre(theatreID, theatreName);
        theatres.put(theatreID, theatre);
        System.out.println("A new theatre with theatreID:"+theatreID+" and theatreName:"+theatreName+" has been created");
        return theatre;
    }

    public Screen createScreenInTheatre(String screenName, Theatre theatre){
        Screen screen = createScreen(screenName, theatre);
        theatre.addScreen(screen);
        System.out.println("A new screen in theatre with theatreName:"+theatre.getTheatreName()+" and screenName:"+screenName+" has been created");
        return screen;
    }

    /**
     * CREATE A SEAT IN THE SCREEN
     *
     * @param rowNumber in which row the seat is
     * @param seatNumber  actual seat number
     * @param screen   at which screen
     * @return  type {@Seat}
     */
    public Seat createSeatInScreen(int rowNumber, int seatNumber, Screen screen){
        String seatID = UUID.randomUUID().toString();
        Seat seat = new Seat(seatID, seatNumber, rowNumber);
        seats.put(seatID, seat);
        screen.addSeat(seat);
        System.out.println("A new Seat in the screen with " +
                "{ rowNumber:"+rowNumber+", " +
                "seatNumber:"+seatNumber+
                ", screenName_&_ID:"+screen.getScreenName()+
                " "+screen.getScreenID());
        return seat;
    }

    /**
     * CREATE A SCREEN
     *
     * @param screenName  NAME OF THE SCREEN
     * @param theatre  IN WHICH THEATRE THE SCREEN IS
     * @return  type {@Screen}
     */
    private Screen createScreen(String screenName, Theatre theatre){
        String screenID = UUID.randomUUID().toString();
        Screen screen = new Screen(screenID, screenName, theatre);
        screens.put(screenID, screen);
        System.out.println("A new Screen with screenID:"+screenID+" and screenName:"+screenName+" has been created");
        return screen;
    }
}
