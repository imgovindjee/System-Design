package com.XX.LLD.PRACTICE.DesignTicketBooking.Controller;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.BookingService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.ShowService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.TheatreService;

import java.util.List;
import java.util.stream.Collectors;

public class BookingController {

    private ShowService showService;
    private BookingService bookingService;
    private TheatreService theatreService;

    /**
     * {@AllArgsConstructor} CONSTRUCTOR
     *
     * @param showService  as args get {@show}
     * @param bookingService  as args get {@booking}
     * @param theatreService as args get {@theatre}
     */
    public BookingController(ShowService showService, BookingService bookingService, TheatreService theatreService) {
        this.showService = showService;
        this.bookingService = bookingService;
        this.theatreService = theatreService;
    }

    /**
     * Create a Booking
     *
     * @param userID {@NotNull} unique user id
     * @param showID {@NotNull} unique show id
     * @param seatIDs {@NotNull {@list}} LIST OF unique seatIds
     * @return type {@String}
     */
    public String createBooking(String userID, String showID, List<String> seatIDs){
        Show show = showService.getShow(showID);
        List<Seat> seats = seatIDs.stream()
                .map(theatreService::getSeat)
                .collect(Collectors.toList());
        return bookingService.createBooking(userID, show, seats).getBookingID();
    }
}
