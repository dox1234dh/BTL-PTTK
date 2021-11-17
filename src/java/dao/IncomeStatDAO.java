/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.DAO;
import java.util.ArrayList;
import java.util.Date;
import model.IncomeStat;

/**
 *
 * @author Administrator
 */
public class IncomeStatDAO extends DAO{

    public IncomeStatDAO() {
    }
    public ArrayList<IncomeStat> getReportOfIncomeStat(Date dateBegin, Date dateEnd) {

       ArrayList<IncomeStat> result = new ArrayList<IncomeStat>();
        return result;
    }
}
