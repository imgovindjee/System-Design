package com.XX.LLD.PRACTICE.DesignTicketBooking.Test.Main;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ChildTest1 extends ParentTest{

    public void setUp(){
        setUpControllers(10, 0);
    }

    public void testCase1(){
        String user1 = "User1";
        String user2 = "User2";

        System.out.println("------------------------------------------------------------------------------------");

        String movie = movieController.createMovie("Movie-1");
        String screen = setUpScreen();
        System.out.println("------------------------------------------------------------------------------------");
        List<String> screen1SeatIDs = createSeats(theatreController, screen, 2, 10);
        System.out.println("------------------------------------------------------------------------------------");

        String show = showController.createShow(movie, screen, new Date(), 2*60*60);

        List<String> user1_availableSeats = showController.getAvailableSeats(show);

//        Validate that seat user1 received has all screen seats
        validateSeatsList(user1_availableSeats, screen1SeatIDs, new ArrayList<>());

        List<String> user1_selectedSeats = Arrays.asList(
                screen1SeatIDs.get(0),
                screen1SeatIDs.get(2),
                screen1SeatIDs.get(5),
                screen1SeatIDs.get(10)
                );
        String bookingID = bookingController.createBooking(user1, show, user1_selectedSeats);
        paymentController.paymentSuccess(bookingID, user1);

        List<String> user2_availableSeats = showController.getAvailableSeats(show);
//        Validate that user2 seats has all screen except the ones already booked
        validateSeatsList(user2_availableSeats, screen1SeatIDs, user1_selectedSeats);

//        CHECKING THE AVAILABLE SEATS AFTER BOOKING
        getAllAvailableSeats(show);
    }

    public static void main(String[] args){
        ChildTest1 childTest1 = new ChildTest1();
        childTest1.setUp();
        childTest1.testCase1();
    }
}
