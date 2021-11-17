/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.apache.tomcat.jni.Time;


/**
 *
 * @author Administrator
 */
public class ScheduleMovie {
    private int id;
    private Date dateOfMovie;
    private double price;
    private Time showtime;
    private Movie movie;
    private MovieRoom movieRoom;

    public ScheduleMovie() {
        super();
     
    }

    public ScheduleMovie(Date dateOfMovie, double price, Time showtime, Movie movie, MovieRoom movieRoom) {
        super();
        this.dateOfMovie = dateOfMovie;
        this.price = price;
        this.showtime = showtime;
        this.movie = movie;
        this.movieRoom = movieRoom;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfMovie() {
        return dateOfMovie;
    }

    public double getPrice() {
        return price;
    }

    public Time getShowtime() {
        return showtime;
    }

    public Movie getMovie() {
        return movie;
    }

    public MovieRoom getMovieRoom() {
        return movieRoom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfMovie(Date dateOfMovie) {
        this.dateOfMovie = dateOfMovie;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setShowtime(Time showtime) {
        this.showtime = showtime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setMovieRoom(MovieRoom movieRoom) {
        this.movieRoom = movieRoom;
    }
    
    
}
