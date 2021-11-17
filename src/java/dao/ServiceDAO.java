/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Service;

/**
 *
 * @author Administrator
 */
public class ServiceDAO extends DAO{

    public ServiceDAO() {
    }
    
    public ArrayList<Service> getService(){
        ArrayList<Service> result = new ArrayList<Service>();
        return result;
    }
    public boolean editService(Service service) {

        return true;
    }

    public boolean addService(Service service) {

        return true;
    }

    public ArrayList<Service> searchServiceName(String name) {
        ArrayList<Service> result = new ArrayList<Service>();
        return result;
    }
    
    public boolean deleteService(Service service) {

        return true;
    }
}
