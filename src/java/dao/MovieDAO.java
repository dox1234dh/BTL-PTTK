/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Movie;
import model.ScheduleMovie;

/**
 *
 * @author Administrator
 */
public class MovieDAO extends DAO {

    public MovieDAO() {

    }

    public boolean editMovie(Movie movie) {

        return true;
    }

    public boolean addMovie(Movie movie) {

        return true;
    }

    public ArrayList<Movie> searchMovieName(String name) {
        ArrayList<Movie> result = new ArrayList<Movie>();
        return result;
    }

    public ArrayList<Movie> searchMovieUpcomingAndShowing() {
        ArrayList<Movie> result = new ArrayList<Movie>();
        return result;
    }
    public ArrayList<Movie> searchMovieBySchedule(ScheduleMovie sv) {
        ArrayList<Movie> result = new ArrayList<Movie>();
        return result;
    }
    public ArrayList<Movie> getMovie(){
        ArrayList<Movie> result = new ArrayList<Movie>();
        return result;
    }
}
