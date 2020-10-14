package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class StrawberrySauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public StrawberrySauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + StrawberrySauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}