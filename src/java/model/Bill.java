/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Bill {

    private int id;
    private int sumOfTicket;
    private Date date;
    private float totalPrice;
    private ArrayList<UsedService> listUService;
    private ArrayList<Ticket> listTicket;
    private TicketSeller seller;

    public Bill() {
        super();
    }

    public Bill(int sumOfTicket, Date date, float totalPrice, ArrayList<UsedService> listUService, ArrayList<Ticket> listTicket, TicketSeller seller) {
        super();
        this.sumOfTicket = sumOfTicket;
        this.date = date;
        this.totalPrice = totalPrice;
        this.listUService = listUService;
        this.listTicket = listTicket;
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public int getSumOfTicket() {
        return sumOfTicket;
    }

    public Date getDate() {
        return date;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<UsedService> getListUService() {
        return listUService;
    }

    public ArrayList<Ticket> getListTicket() {
        return listTicket;
    }

    public TicketSeller getSeller() {
        return seller;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumOfTicket(int sumOfTicket) {
        this.sumOfTicket = sumOfTicket;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setListUService(ArrayList<UsedService> listUService) {
        this.listUService = listUService;
    }

    public void setListTicket(ArrayList<Ticket> listTicket) {
        this.listTicket = listTicket;
    }

    public void setSeller(TicketSeller seller) {
        this.seller = seller;
    }

}
