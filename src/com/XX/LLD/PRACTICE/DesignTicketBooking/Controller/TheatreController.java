package com.XX.LLD.PRACTICE.DesignTicketBooking.Controller;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Screen;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Theatre;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.TheatreService;

public class TheatreController {

    private TheatreService theatreService;

    /**
     * @AllArgsConstructor
     *
     * @param theatreService helps in creating a theatre
     */
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    /**
     * Create a theatre
     *
     * @param theatreName {@NotNull} name of the theatre
     * @return type {@String}
     */
    public String createTheatre(String theatreName){
        return theatreService.createTheatre(theatreName).getTheatreID();
    }

    /**
     * Create a Screen in Theatre
     *
     * @param screenName {@NotNull} name of the screen
     * @param theatreID {@NotNull} unique theatreID
     * @return type {@String}
     */
    public String createScreenInTheatre(String screenName, String theatreID){
        Theatre theatre = theatreService.getTheatre(theatreID);
        return theatreService.createScreenInTheatre(screenName, theatre).getScreenID();
    }

    /**
     * Create a Seat in Screen
     *
     * @param rowNumber {@NotNull} in which row that seat is placed
     * @param seatNumber {@NotNull} seat number
     * @param screenID {@NotNull} unique screenID
     * @return type {@String}
     */
    public String createSeatInScreen(int rowNumber, int seatNumber, String screenID){
        Screen screen = theatreService.getScreen(screenID);
        return theatreService.createSeatInScreen(rowNumber, seatNumber, screen).getSeatID();
    }
}
