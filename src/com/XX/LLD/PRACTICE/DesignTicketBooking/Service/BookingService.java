package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.BadRequestException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.NotFoundException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.SeatParmanentlyUnavailableException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Booking;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Provider.SeatLockProvider;

import java.util.*;
import java.util.stream.Collectors;

public class BookingService {

    private Map<String, Booking> showBooking;
    private SeatLockProvider seatLockProvider;

    public BookingService(SeatLockProvider seatLockProvider){
        this.seatLockProvider = seatLockProvider;
        this.showBooking = new HashMap<>();
    }

    public Booking getBooking(String bookingID){
        if(!showBooking.containsKey(bookingID)){
            System.out.println("");
//            throw new NotFoundException();
        }
        return showBooking.get(bookingID);
    }

    public List<Booking> getAllBookings(Show show){
        List<Booking> bookingList = new ArrayList<>();
        for(Booking booking:showBooking.values()){
            if(show.equals(booking.getShow())){
                bookingList.add(booking);
            }
        }
        return bookingList;
    }

    public Booking createBooking(String userID, Show show, List<Seat> seat){
        if(isAnySeatAlreadyBooked(show, seat)){
            System.out.println("");
//            throw new SeatParmanentlyUnavailableException();
        }

        seatLockProvider.lockSeats(show, seat, userID);
        String bookingID = UUID.randomUUID().toString();
        Booking newBooking = new Booking(bookingID, show, seat, userID);
        showBooking.put(bookingID, newBooking);
        System.out.println("-------------------------------------------------------------\n" +
                "A new booking having" +
                "\nUser: "+userID+
                "\nBookingID: "+bookingID+
                "\nMovie Name: "+show.getMovie().getMovieName()+
                "\nDuration of Movie: "+show.getDurationInSecond()+
                "\n-----------------------------------------------------------------------------");
        return newBooking;
    }

    public List<Seat> getBookedSeats(Show show){
        return getAllBookings(show).stream()
                .filter(Booking::isConfirmed)
                .map(Booking::getSeatsBooked)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public void confirmBooking(Booking booking, String user){
        if(!booking.getUser().equals(user)){
            System.out.println("");
            throw new BadRequestException();
        }

        for (Seat seat:booking.getSeatsBooked()){
            if(!seatLockProvider.validateLock(booking.getShow(), seat, user)){
                System.out.println("");
//                throw new BadRequestException();
            }
        }
        booking.confirmBooking();
        System.out.println("Your booking has been Confirmed. " +
                "Movie: "+booking.getShow().getMovie().getMovieName());
    }

    private boolean isAnySeatAlreadyBooked(Show show, List<Seat> seats){
        List<Seat> bookedSeat = getBookedSeats(show);
        for(Seat seat:seats){
            if(bookedSeat.contains(seat)){
                return true;
            }
        }
        return false;
    }
}
