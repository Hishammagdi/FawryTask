/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskfawry;

import java.util.Vector;

/**
 *
 * @author Hisham
 */
public class CheckOut {
    public Customer customer ; 
    public Cart cart;
    public CheckOut( Customer customer, Cart cart){
        this.customer = customer;
        this.cart = cart;
    }
    public void checkout(){
          double totalPriceItems = 0;
        double totalshipItems = 0;
        double totalPrice ;
        Vector<ShippingProduct> ship = new Vector<>();

        if(cart.CartIsEmpty()){
           throw new RuntimeException( "!!!Error  ..... The cart is empty .. ");
        }
        else{
            for (int i = 0;i<cart.items.size();i++){
                if (cart.items.get(i).Quantity > cart.items.get(i).products.getQuantityPro()){
                    System.out.println("the product  " +cart.items.get(i).products.getNamePro()+"please insert number of quantity less than or equal  Quantity Product");
                    continue;
                }
                
                if (cart.items.get(i).products.IsExpired()){
                     System.out.println( "the product  " +cart.items.get(i).products.getNamePro()+ "Sorry this product is expired!!!");
                     continue;
                }
                
                totalPriceItems +=( cart.items.get(i).products.getPricePro()*cart.items.get(i).Quantity);
                if (cart.items.get(i).products instanceof ShippingProduct){
                  ship.add((ShippingProduct)cart.items.get(i).products);
                  totalshipItems += ShippingProduct.priceShipping;
                }
            }
            
            totalPrice = totalPriceItems+totalshipItems;
        }
        while(true){
        if (customer.getBalance() < totalPrice ){
            System.out.println( "Sorry your balance Insufficient !!!");
            break;
        }
        ShippingService shipped = new ShippingService(ship);
               System.out.println("** Shipment notice **");
             
               for (int i = 0 ; i<ship.size();i++){
                      System.out.println(cart.items.get(i).Quantity+"x" +"  "+ ship.get(i).getName() + " " + ship.get(i).getWeight()*cart.items.get(i).Quantity + "kg");
                      shipped.calaulateTotalWeight((ship.get(i).getWeight()*cart.items.get(i).Quantity));
               }  
               System.out.println("Total package weight " + ShippingService.weight+ "kg");
        //shipped.shippedItems(ship);
        
        System.out.println("** Checkout receipt **");              
        for (int i = 0 ; i<cart.items.size();i++){
           
            System.out.println(  cart.items.get(i).Quantity+"x" +"  "+ cart.items.get(i).products.NamePro+"      " +
                   cart.items.get(i).products.getPricePro()*cart.items.get(i).Quantity  );
        }
        System.out.println("----------------------------");
        System.out.println("Subtotal            " +   totalPriceItems);
        System.out.println("Shipping            " +   totalshipItems);      
        System.out.println("Amount            " +   totalPrice);
        break;
        }
    }
}
