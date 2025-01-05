package com.XX.LLD.PRACTICE.DesignTicketBooking.Test.Main;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Controller.*;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Provider.SeatLockProviderImpementation;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ParentTest {

    protected BookingController bookingController;
    protected ShowController showController;
    protected TheatreController theatreController;
    protected MovieController movieController;
    protected PaymentController paymentController;

    protected void setUpControllers(int lockTime, int allowedRetries){
        SeatLockProviderImpementation seatLockProvider = new SeatLockProviderImpementation(lockTime);
        BookingService bookingService = new BookingService(seatLockProvider);
        MovieService movieService = new MovieService();
        ShowService showService = new ShowService();
        TheatreService theatreService = new TheatreService();
        SeatAvailableService seatAvailableService = new SeatAvailableService(bookingService, seatLockProvider);
        PaymentService paymentService = new PaymentService(allowedRetries, seatLockProvider);

        bookingController = new BookingController(showService, bookingService, theatreService);
        showController = new ShowController(seatAvailableService, showService, theatreService, movieService);
        theatreController = new TheatreController(theatreService);
        movieController = new MovieController(movieService);
        paymentController = new PaymentController(paymentService, bookingService);
    }

    protected void validateSeatsList(List<String> seatsList, List<String> allSeatsInScreen, List<String> excludedSeats){
        for (String includedSeat: allSeatsInScreen){
            if(!excludedSeats.contains(includedSeat)){
                Assert.assertTrue(seatsList.contains(includedSeat));
            }
        }

        for (String excludedSeat: excludedSeats){
            Assert.assertFalse(seatsList.contains(excludedSeat));
        }
    }

    protected List<String> createSeats(TheatreController theatreController, String screen, int numRows, int numberOfSeatsInRow){
        List<String> seats = new ArrayList<>();
        for (int row = 0; row < numRows; row++){
            for (int seatNo = 0; seatNo < numberOfSeatsInRow; seatNo++){
                String seat = theatreController.createSeatInScreen(row, seatNo, screen);
                seats.add(seat);
            }
        }
        return seats;
    }

    protected String setUpScreen(){
        String theatre = theatreController.createTheatre("Theatre-1");
        return theatreController.createScreenInTheatre("Screen 1", theatre);
    }

    protected void getAllAvailableSeats(String showID){
        List<String> seats = showController.getAvailableSeats(showID);
        for (String seat:seats){
            System.out.println(" "+seat);
        }
    }
}
