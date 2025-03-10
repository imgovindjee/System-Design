package com.XX.LLD.PRACTICE.DesignTicketBooking.Controller;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Movie;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Screen;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.MovieService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.SeatAvailableService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.ShowService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.TheatreService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ShowController {

    private SeatAvailableService seatAvailableService;
    private ShowService showService;
    private TheatreService theatreService;
    private MovieService movieService;

    /**
     * @AllArgsConstructor CONSTRUCTOR
     *
     * @param seatAvailableService {@NotNull}
     * @param showService {@NotNull}
     * @param theatreService {@NotNull}
     * @param movieService {@NotNull}
     */
    public ShowController(SeatAvailableService seatAvailableService, ShowService showService, TheatreService theatreService, MovieService movieService) {
        this.seatAvailableService = seatAvailableService;
        this.showService = showService;
        this.theatreService = theatreService;
        this.movieService = movieService;
    }

    /**
     * Create a Show
     *
     * @param movieID {@NotNull} unique movieID
     * @param screenID {@NotNull} unique screenID
     * @param startTime {@NotNull} starting time of the {@Show}
     * @param durationInSecond {@NotNull} duration of the {@Show}
     * @return type {@String}
     */
    public String createShow(String movieID, String screenID, Date startTime, int durationInSecond){
        Screen screen = theatreService.getScreen(screenID);
        Movie movie = movieService.getMovie(movieID);
        System.out.println("--------------------------------------------------------\n" +
                "A new Show having\n" +
                "showID:"+movieID+
                "\nMovie Name: "+movie.getMovieName()+
                "\nDuration of Movie: "+durationInSecond+
                "\nis been created" +
                "\n----------------------------------------------------------------");
        return showService.createShow(movie, screen, startTime, durationInSecond).getShowID();
    }

    /**
     * Get all the List of Available Seats
     *
     * @param showID {@NotNull} unique showID
     * @return type {@String}
     */
    public List<String> getAvailableSeats(String showID){
        Show show = showService.getShow(showID);
        List<Seat> availableSeats = seatAvailableService.getAvailableSeats(show);
        return availableSeats.stream()
                .map(Seat::getSeatID)
                .collect(Collectors.toList());
    }
}
