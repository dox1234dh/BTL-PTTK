/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class Movie {
    private int id;
    private String movieName;
    private String type;
    private String actor;
    private String director;
    private String trailer;

    public Movie() {
        super();
    }

    public Movie(String movieName, String type, String actor, String director, String trailer) {
       super();
        this.movieName = movieName;
        this.type = type;
        this.actor = actor;
        this.director = director;
        this.trailer = trailer;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getType() {
        return type;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    
    
}
