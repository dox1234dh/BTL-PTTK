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
public class Seat {
    private int id;
    private String type;
    private boolean status;

    public Seat() {
        super();
    }

    public Seat( String type, boolean status) {
        super();
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
