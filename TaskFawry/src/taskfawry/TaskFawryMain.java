/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskfawry;

/**
 *
 * @author Hisham
 */
import java.time.*;
public class TaskFawryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product cheese = new ShippingProduct("Cheese", 500, 100.0, 0.2);
        Product tv = new ShippingProduct("tv", 0, 10.0, 0.5);
        Product biscuits = new ShippingProduct("Biscuits", 1000, 150.0, 0.7);
        ExpireProduct scratchCard = new ExpireProduct("Scratch Card", 50, 20,0) {};
      /*System.out.println( scratchCard.IsExpired());
        System.out.println(scratchCard.StartDate);
        System.out.println(scratchCard.EndDate);
        System.out.println( scratchCard.IsExpired()); */

       Cart cart = new Cart();
       Customer customer = new Customer("Hisham", 1000);
     
       cart.addItem(cheese, 2); 
       cart.addItem(tv, 3);
       cart.addItem(biscuits, 1);     
       cart.addItem(scratchCard, 1);
       
       
       CheckOut check =new  CheckOut(customer ,cart );
       check.checkout();


    }
    
}
