/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;

/**
 *
 * @author Administrator
 */
public class UserDAO extends DAO{

    public UserDAO() {
    }
    public boolean checkLogin(User user){
        return true;
    }
    public boolean register(User user){
        return true;
    }
}
