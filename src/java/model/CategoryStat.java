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
public class CategoryStat {
    private Date dateBegin;
    private Date dateEnd;
    private double income;

    public CategoryStat() {
        super();
    }

    public CategoryStat(Date dateBegin, Date dateEnd, double income) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.income = income;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public double getIncome() {
        return income;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    
}
