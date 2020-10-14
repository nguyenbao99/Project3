package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class CandyTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public CandyTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + CandyTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}