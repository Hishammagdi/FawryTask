/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskfawry;

import java.util.*;

/**
 *
 * @author Hisham
 */

public class Customer {
    private String NameCus;
    private double balance;

    public String getNameCus() {
        return NameCus;
    }

    public double getBalance() {
        return balance;
    }
    
    public Customer(String NameCus,double balance){
        this.NameCus = NameCus;
        this.balance= balance;
    }
    
}
