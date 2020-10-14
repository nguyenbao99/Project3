package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class IceCreamTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public IceCreamTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + IceCreamTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}