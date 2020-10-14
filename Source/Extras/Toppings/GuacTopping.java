package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class GuacTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public GuacTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + GuacTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}