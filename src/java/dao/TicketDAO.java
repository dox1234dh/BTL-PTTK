/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Ticket;

/**
 *
 * @author Administrator
 */
public class TicketDAO extends DAO{
     public TicketDAO() {
    }
    
    public ArrayList<Ticket> searchTicket(int idOrder){
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        return result;
    }
    
    public boolean addTicketOrder(ArrayList<Ticket> tickets){
        boolean result = false;
        return result;
    }
    public boolean delTicket(Ticket ticket){
        boolean result = false;
        return result;
    }
    public int IdTicketOrder(){
        int result = 0;
        return result;
    }
}
