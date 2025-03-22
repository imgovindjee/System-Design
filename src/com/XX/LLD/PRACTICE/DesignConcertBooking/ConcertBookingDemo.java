package com.XX.LLD.PRACTICE.DesignConcertBooking;

import com.XX.LLD.PRACTICE.DesignConcertBooking.Booking.Booking;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Concert.Concert;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Concert.ConcertBooking;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.Seat;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.SeatStatus;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.SeatType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcertBookingDemo {

    public static void run() {
//          SYSTEM INSTANCE
        ConcertBooking concertBooking = ConcertBooking.getInstance();

//        CREATE  CONCERT's
//        1.
        List<Seat> seatList1 = generateSeats(100);
        Concert concert1 = new Concert("C001", "Artist-1", "Venue-1", seatList1, LocalDateTime.now().plusDays(12));
        concertBooking.addConcert(concert1);
//        2.
        List<Seat> seatList2 = generateSeats(70);
        Concert concert2 = new Concert("C002", "Artist-2", "Venue-2", seatList2, LocalDateTime.now().plusDays(24));
        concertBooking.addConcert(concert2);

//        CREATE USER's
        User user1 = new User("USER-1", "user1@gmail.com", "USER001");
        User user2 = new User("USER-2", "user2@gmail.com", "USER002");
        User user3 = new User("USER-3", "user3@gmail.com", "USER003");
        User user4 = new User("USER-4", "user4@gmail.com", "USER004");

//        SEARCH CONCERT
        List<Concert> searchConcert = concertBooking.searchConcert("Artist-1", "Venue-1", LocalDateTime.now().plusDays(12));
        System.out.println("\n\n--------------Search Results--------------");
        for (Concert sc:searchConcert) {
            System.out.println("Concert: "+sc.getArtist()+" at "+sc.getVenue());
        }

//        BOOK TICKET
//        1.
        List<Seat> selectedSeat1 = selectSeats(concert1, 100);
        Booking booking1 = concertBooking.bookTicket(user1, concert1, selectedSeat1);
//        2.
        List<Seat> selectedSeat2 = selectSeats(concert2, 1);
        Booking booking2 = concertBooking.bookTicket(user2, concert2, selectedSeat2);

//        concertBooking.cancelBooking(booking1.getBookingID()); // CANCEL BOOKING

//        3.
        List<Seat> selectedSeat3 = selectSeats(concert1, 12);
        Booking booking3 = concertBooking.bookTicket(user3, concert1, selectedSeat3);
//        4.
        List<Seat> selectedSeat4 = selectSeats(concert2, 45);
        Booking booking4 = concertBooking.bookTicket(user4, concert2, selectedSeat4);
    }

    private static List<Seat> generateSeats(int numberOfSeats) {
        List<Seat> seatList = new ArrayList<>();
        for (int i=1; i<=numberOfSeats; i++){
            String seatNumber = "S"+i;
            SeatType seatType = (i<10)?SeatType.VIP:(i<=30)?SeatType.PREMIUM:SeatType.REGULAR;
            double price = seatType==SeatType.VIP?100.0:seatType==SeatType.PREMIUM?80.0:60.0;
            seatList.add(new Seat(seatNumber, seatNumber, seatType, price));
        }
        return seatList;
    }

    private static List<Seat> selectSeats(Concert concert, int numberOfSeats) {
        List<Seat> availableSeats = concert.getSeatList().stream()
                .filter(seat -> seat.getSeatStatus()== SeatStatus.AVAILABLE)
                .limit((numberOfSeats))
                .toList();
        return new ArrayList<>(availableSeats);
    }
}
