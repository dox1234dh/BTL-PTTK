/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.MovieRoom;

/**
 *
 * @author Administrator
 */
public class MovieRoomDAO extends DAO{
    public MovieRoomDAO() {
    }
    public boolean EditMovieRoom(MovieRoom movie){
        
        return true;
    }
    public ArrayList<MovieRoom> SearchMovieRoomName(MovieRoom movieroom){
        ArrayList<MovieRoom> result = new ArrayList<MovieRoom>();
        return result;
    }
}
