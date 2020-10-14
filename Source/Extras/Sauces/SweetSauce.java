package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class SweetSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public SweetSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + SweetSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}