/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.Bill;
import model.Client;

/**
 *
 * @author Administrator
 */
public class BillDAO extends DAO {

    public BillDAO() {
    }

    public ArrayList<Bill> getDetailReportOfCustomer(Client client, Date dateBegin, Date dateEnd) {
        ArrayList<Bill> result = new ArrayList<Bill>();
        return result;
    }

    public ArrayList<Bill> getDetailReportOfCategory(String category, Date dateBegin, Date dateEnd) {
        ArrayList<Bill> result = new ArrayList<Bill>();
        return result;
    }

    public ArrayList<Bill> getDetailReport(String nameDate, Date dateBegin, Date dateEnd) {
        ArrayList<Bill> result = new ArrayList<Bill>();
        return result;
    }

    public ArrayList<Bill> getDetailReportMoive(String movie, Date dateBegin, Date dateEnd) {
        ArrayList<Bill> result = new ArrayList<Bill>();
        return result;
    }

    public boolean addBill(Bill bill) {
        boolean result = false;
        return result;
    }
}
