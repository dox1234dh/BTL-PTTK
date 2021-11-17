/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.CategoryStat;

/**
 *
 * @author Administrator
 */
public class CategoryStatDAO extends DAO {

    public CategoryStatDAO() {
    }

    public ArrayList<CategoryStat> getReportOfCategory(Date dateBegin, Date dateEnd) {

        ArrayList<CategoryStat> result = new ArrayList<CategoryStat>();
        return result;
    }
}
