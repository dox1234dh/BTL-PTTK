/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.ScheduleMovie;

/**
 *
 * @author Administrator
 */
public class ScheduleMovieDAO extends DAO {

    public ScheduleMovieDAO() {
    }

    public ArrayList<ScheduleMovie> getSchedule() {
        ArrayList<ScheduleMovie> result = new ArrayList<ScheduleMovie>();
        return result;
    }

    public ArrayList<ScheduleMovie> searchScheduleByDay(Date day) {
        ArrayList<ScheduleMovie> result = new ArrayList<ScheduleMovie>();
        return result;
    }

    public boolean CreateSchedule(ScheduleMovie sv) {
        
        return true;
    }
    public boolean EditSchedule(ScheduleMovie sv) {
        
        return true;
    }
    public boolean DeleteSchedule(ScheduleMovie sv) {
        
        return true;
    }
    public ArrayList<ScheduleMovie> searchScheduleByMovieName(String MovieName) {
        ArrayList<ScheduleMovie> result = new ArrayList<ScheduleMovie>();
        return result;
    }
}
