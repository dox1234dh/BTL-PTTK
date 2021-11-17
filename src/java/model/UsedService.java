/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class UsedService {
    private int id;
    private int sumOfService;
    private double sumOfPrice;
    private double saleoff;
    private Service service;

    public UsedService() {
        super();
    }

    public UsedService(int sumOfService, double sumOfPrice, double saleoff, Service service) {
        super();
        this.sumOfService = sumOfService;
        this.sumOfPrice = sumOfPrice;
        this.saleoff = saleoff;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public int getSumOfService() {
        return sumOfService;
    }

    public double getSumOfPrice() {
        return sumOfPrice;
    }

    public double getSaleoff() {
        return saleoff;
    }

    public Service getService() {
        return service;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumOfService(int sumOfService) {
        this.sumOfService = sumOfService;
    }

    public void setSumOfPrice(double sumOfPrice) {
        this.sumOfPrice = sumOfPrice;
    }

    public void setSaleoff(double saleoff) {
        this.saleoff = saleoff;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    
}
