/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class MovieRoom {
    private int id;
    private String name;
    private boolean status;
    private int totalSeat;
    private ArrayList<Seat> listSeat;

    public MovieRoom() {
        super();
    }

    public MovieRoom(String name, boolean status, int totalSeat, ArrayList<Seat> listSeat) {
        super();
        this.name = name;
        this.status = status;
        this.totalSeat = totalSeat;
        this.listSeat = listSeat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public ArrayList<Seat> getListSeat() {
        return listSeat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public void setListSeat(ArrayList<Seat> listSeat) {
        this.listSeat = listSeat;
    }
    
}
