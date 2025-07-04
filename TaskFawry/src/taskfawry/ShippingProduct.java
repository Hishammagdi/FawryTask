/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskfawry;

/**
 *
 * @author Hisham
 */

interface Ship {
    String getName();
    double getWeight();
}

public class ShippingProduct extends Product implements Ship  {
    
    private double Weight;
    static final double priceShipping = 15;
    
    public ShippingProduct(String NamePro  , int QuantityPro,double PricePro , double Weight){
        super(NamePro ,QuantityPro, PricePro);
        this.Weight = Weight;
    }
    @Override
    public boolean IsExpired() {
            return false;
    }

    @Override
    public String getName() {
        
        return NamePro;
    }
    
    @Override
    public double getWeight() {
        return Weight;
    }

}
