/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.apache.tomcat.jni.Time;

/**
 *
 * @author Administrator
 */
public class Ticket {
    private int id;
    private double price;
    private Time date;
    private boolean status;
    private ScheduleMovie schedule;
    private Seat seat;
    private Client client;

    public Ticket() {
        super();
    }

    public Ticket(double price, Time date, boolean status, ScheduleMovie schedule, Seat seat, Client client) {
        super();
        this.price = price;
        this.date = date;
        this.status = status;
        this.schedule = schedule;
        this.seat = seat;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Time getDate() {
        return date;
    }

    public boolean isStatus() {
        return status;
    }

    public ScheduleMovie getSchedule() {
        return schedule;
    }

    public Seat getSeat() {
        return seat;
    }

    public Client getClient() {
        return client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSchedule(ScheduleMovie schedule) {
        this.schedule = schedule;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
