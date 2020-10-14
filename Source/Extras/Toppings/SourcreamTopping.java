package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class SourcreamTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public SourcreamTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + SourcreamTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}