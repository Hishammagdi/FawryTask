/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskfawry;

/**
 *
 * @author Hisham
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class ExpireProduct extends Product {
    
    protected int DaysToExpired ; 
    public LocalDate EndDate ; 
    public ExpireProduct (String NamePro  , int QuantityPro,double PricePro , int DaysToExpired){
        super(NamePro ,QuantityPro, PricePro);
        final String str = "2025-07-03";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate StartDate = LocalDate.parse(str, formatter);
 
        this.DaysToExpired = DaysToExpired;
        this.EndDate = StartDate.plusDays(DaysToExpired);
    }
    @Override
    public boolean IsExpired() {      
            if (EndDate.isBefore(LocalDate.now())){
                return true;
            }
            return false;
    }
}
