package com.XX.LLD.PRACTICE.DesignBookMyShow.DriveCode.BookMyShow;

import com.XX.LLD.PRACTICE.DesignBookMyShow.Booking;
import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.City;
import com.XX.LLD.PRACTICE.DesignBookMyShow.ENum.SeatCategory;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Movie.Movie;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Movie.MovieController;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Screen;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Seat;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Show;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Threater.Threater;
import com.XX.LLD.PRACTICE.DesignBookMyShow.Threater.ThreaterController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    MovieController movieController;
    ThreaterController threaterController;

//    CONSTRUCTOR
    public Main() {
        movieController = new MovieController();
        threaterController = new ThreaterController();
    }

    private void initialize(){
//        CREATE MOVIE
        createMovie();
//        CREATE THEATER
//        WITH SCREEN, SEATS, and SHOW
        createTheather();
    }

    private void createMovie() {
//        CREATE MOVIE - 1
        Movie movie1 = new Movie();
        movie1.setMovieID(1);
        movie1.setMovieName("AVENGER");
        movie1.setMovieDuration(188);

//        CREATE MOVIE - 2
        Movie movie2 = new Movie();
        movie2.setMovieID(2);
        movie2.setMovieName("BAAHUBALI");
        movie2.setMovieDuration(180);

//       CREATE MOVIE - 3
        Movie movie3 = new Movie();
        movie3.setMovieID(3);
        movie3.setMovieName("SAALAR");
        movie3.setMovieDuration(158);

//        ADD MOVIES
//        AGAINST THE CITIES
        movieController.addMovie(movie1, City.BANGALORE);
        movieController.addMovie(movie1, City.DELHI);
        movieController.addMovie(movie1, City.CHENNAI);
        movieController.addMovie(movie2, City.BANGALORE);
        movieController.addMovie(movie2, City.CHENNAI);
        movieController.addMovie(movie3, City.DELHI);
        movieController.addMovie(movie3, City.BANGALORE);
        movieController.addMovie(movie3, City.CHENNAI);
    }

    private void createTheather() {
        Movie avenger_movie = movieController.getMovieByName("AVENGER");
        Movie baahubali_movie = movieController.getMovieByName("BAAHUBALI");
        Movie saalar_movie = movieController.getMovieByName("SAALAR");

        Threater inox_theater = new Threater();
        inox_theater.setThreaterID(1);
        inox_theater.setCity(City.BANGALORE);
        inox_theater.setScreenList(createScreen());
        List<Show> inoxShow = new ArrayList<>();
        inoxShow.add(createShow(1, inox_theater.getScreenList().get(0), avenger_movie, 8));
        inoxShow.add(createShow(2, inox_theater.getScreenList().get(0), baahubali_movie, 16));
        inoxShow.add(createShow(3, inox_theater.getScreenList().get(0), saalar_movie, 20));
        inox_theater.setShowList(inoxShow);

        Threater pvr_theater = new Threater();
        pvr_theater.setThreaterID(2);
        pvr_theater.setCity(City.DELHI);
        pvr_theater.setScreenList(createScreen());
        List<Show> pvrShow = new ArrayList<>();
        pvrShow.add(createShow(10, pvr_theater.getScreenList().get(0), avenger_movie, 12));
        pvrShow.add(createShow(20, pvr_theater.getScreenList().get(0), baahubali_movie, 16));
        pvrShow.add(createShow(30, pvr_theater.getScreenList().get(0), saalar_movie, 20));
        pvr_theater.setShowList(pvrShow);

        Threater cineplex = new Threater();
        cineplex.setThreaterID(3);
        cineplex.setCity(City.CHENNAI);
        cineplex.setScreenList(createScreen());
        List<Show> cineplex_show = new ArrayList<>();
        cineplex_show.add(createShow(11, cineplex.getScreenList().get(0), avenger_movie, 12));
        cineplex_show.add(createShow(12, cineplex.getScreenList().get(0), baahubali_movie, 16));
        cineplex_show.add(createShow(13, cineplex.getScreenList().get(0), saalar_movie, 20));
        cineplex.setShowList(cineplex_show);

//        ADDING TO THE THEATER
        threaterController.addThreater(inox_theater, City.BANGALORE);
        threaterController.addThreater(pvr_theater, City.DELHI);
        threaterController.addThreater(cineplex, City.CHENNAI);
    }

    private List<Screen> createScreen(){
        List<Screen> screenList = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenID(1);
        screen1.setSeatList(createSeats());
        screenList.add(screen1);
        return screenList;
    }

    private Show createShow(int showID, Screen screen, Movie movie, int showStartTime) {
        Show show = new Show();
        show.setShowID(showID);
        show.setShowStartTime(showStartTime);
        show.setMovie(movie);
        show.setScreen(screen);
        return show;
    }

    private void createBooking(City user_city, String movieName){
//        1. SEARCH MOVIE BY LOCATION
        List<Movie> movieList = movieController.getMoviesByCity(user_city);

//        2. SELECT MOVIES
//        WHICH U WANT TO SEE
        Movie interested_movie = null;
        for(Movie movie:movieList){
            if((movie.getMovieName()).equals(movieName)){
                interested_movie = movie;
                break;
            }
        }

//        3. GET ALL SHOW OF THIS MOVIE IN MY-LOCATION
        Map<Threater, List<Show>> showTheaterWise = threaterController.getAllShows(interested_movie, user_city);

//        4. SELECT THE PARTICULAR SHOW USER IS INTERESTED
        Map.Entry<Threater, List<Show>> entry = showTheaterWise.entrySet().iterator().next();
        List<Show> show_running = entry.getValue();
        Show interested_show = show_running.get(0);

//        5. SELECT THE SEAT
        int seatNumber = 30;
        List<Integer> bookedSeat = interested_show.getBookedSeatIDList();
        System.out.println("Booking For: "+interested_movie.getMovieName());
        System.out.println("Looking for Seat Number: "+seatNumber);
        System.out.println("----------LOADING-----------");
        if (!bookedSeat.contains(seatNumber)) {
            bookedSeat.add(seatNumber);

//            PAYMENT LOGIC HERE
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat: interested_show.getScreen().getSeatList()){
                if(screenSeat.getSeatID() == seatNumber){
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeatList(myBookedSeats);
            booking.setShow(interested_show);
        } else {
//            HANDLE EXCEPTION
            System.out.println("SEAT ALREADY BOOKED, TRY AGAIN");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    private List<Seat> createSeats() {
        List<Seat> seatList = new ArrayList<>();

        int i=0;
//        SILVER SEAT ---> CATEGORY
        for(; i<40; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seatList.add(seat);
        }
//        GOLD SEAT ---> CATEGORY
        for(; i<70; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seatList.add(seat);
        }
//        PLATINUM SEAT ---> CATEGORY
        for(; i<100; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seatList.add(seat);
        }
        return  seatList;
    }



//    DRIVE CODE
    public static void main(String[] args) {
        Main bookMyShow = new Main();

        bookMyShow.initialize();

//        user-1
        bookMyShow.createBooking(City.DELHI, "AVENGER");
        System.out.println("\n----------------------------\n");
//        user-2
        bookMyShow.createBooking(City.BANGALORE, "BAAHUBALI");
        System.out.println("\n----------------------------\n");
//        user-3
        bookMyShow.createBooking(City.DELHI, "SAALAR");
    }
}
