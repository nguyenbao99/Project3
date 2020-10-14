package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class SpicySauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public SpicySauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + SpicySauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}