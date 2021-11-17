/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.TicketOfDayStat;

/**
 *
 * @author Administrator
 */
public class TicketOfDayStatDAO extends DAO{

    public TicketOfDayStatDAO() {
    }

    public ArrayList<TicketOfDayStat> getReportOfDay(Date dateBegin, Date dateEnd) {
        ArrayList<TicketOfDayStat> result = new ArrayList<TicketOfDayStat>();
        return result;
    }
}
