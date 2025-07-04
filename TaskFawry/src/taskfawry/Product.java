/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskfawry;

/**
 *
 * @author Hisham
 */
public  class Product {
    protected String NamePro; 
    protected int QuantityPro; 
    protected double PricePro; 

    public String getNamePro() {
        return NamePro;
    }

    public int getQuantityPro() {
        return QuantityPro;
    }

    public double getPricePro() {
        return PricePro;
    }
    public Product(String NamePro , int QuantityPro , double PricePro){
        this.NamePro =  NamePro;
        this.QuantityPro = QuantityPro;
        this.PricePro = PricePro;
    }
      public void reduceFormQuantityPro(int quantity){
            QuantityPro-=quantity;
        }
    public boolean IsExpired(){
        return false;
    };
    
    public boolean IsShippable(){
        return false;
    }
}
