/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.CustomerStat;

/**
 *
 * @author Administrator
 */
public class CustomerStatDAO extends DAO{

    public CustomerStatDAO() {
    }

    public ArrayList<CustomerStat> getReportOfCustomer(Date dateBegin, Date dateEnd) {

       ArrayList<CustomerStat> result = new ArrayList<CustomerStat>();
        return result;
    }
}
