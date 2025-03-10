package com.XX.LLD.PRACTICE.DesignTicketBooking.Controller;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.MovieService;

public class MovieController {

    private MovieService movieService;

    /**
     * @AllArgsConstructor CONSTRUCTOR
     *
     * @param movieService args helps in creation of the movie
     */
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Create a Movie
     *
     * @param movieName {@NotNull} name of the movie that need to be created
     * @return type {@String}
     */
    public String createMovie(String movieName){
        return movieService.createMovie(movieName).getMovieID();
    }
}
