/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.MovieRoom;
import model.Seat;

/**
 *
 * @author Administrator
 */
public class SeatDAO extends DAO{
    public SeatDAO() {
    }
    public boolean EditSeat(Seat seat){
        
        return true;
    }
    public ArrayList<Seat> SearchListSeat(MovieRoom movieroom){
        ArrayList<Seat> result = new ArrayList<Seat>();
        return result;
    }
    public ArrayList<Seat> getSeat(){
        ArrayList<Seat> result = new ArrayList<Seat>();
        return result;
    }
}
