/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class TicketOfDayStat {

    private Date dateBegin;
    private Date dateEnd;
    private int totalTicket;
    private Double income;

    public TicketOfDayStat() {
        super();
    }

    public TicketOfDayStat(Date dateBegin, Date dateEnd, int totalTicket, Double income) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.totalTicket = totalTicket;
        this.income = income;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public int getTotalTicket() {
        return totalTicket;
    }

    public Double getIncome() {
        return income;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setTotalTicket(int totalTicket) {
        this.totalTicket = totalTicket;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

}
