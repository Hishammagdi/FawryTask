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
public class Cart {
   protected Vector<MyCartItems> items = new Vector<>();
   public void addItem(Product pro , int quantity){
       if (quantity <=pro.getQuantityPro()){
           MyCartItems itms = new MyCartItems(pro , quantity);
           items.add(itms);
       }
       else{
       System.out.println( "the product  " +pro.getNamePro()+ "!!!error .......please define quantity less than or equal product quantity");
       }
   } 
 
   public boolean CartIsEmpty(){
       if(items.isEmpty()){
           return true;
       }
       return false;
   }
}
