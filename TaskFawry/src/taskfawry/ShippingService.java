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
public class ShippingService {
    static public double weight = 0;
    Vector<ShippingProduct> ship = new Vector<>();

    public ShippingService( Vector<ShippingProduct> ship){
        this.ship = ship;
    }
    public void calaulateTotalWeight(double num){
         
               weight += num;
    }
}
