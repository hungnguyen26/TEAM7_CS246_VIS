/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import customermanagement.Customermanagement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class UserDao {
    List<User> lc = new ArrayList<>();
    
    public UserDao(){
        lc.add(new User("admin","123456", true));
    }
    public boolean checkLogin(String usernameString, String pass){
        for(User u : lc)  {
            if(u.getUserName().equals(usernameString)&& u.getPassWord().equals(pass)) 
                  return true;
        }
        return false;
    }
}
