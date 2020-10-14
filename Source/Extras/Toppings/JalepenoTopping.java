package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class JalepenoTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public JalepenoTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + JalepenoTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}