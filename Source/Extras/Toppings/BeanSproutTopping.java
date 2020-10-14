package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class BeanSproutTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public BeanSproutTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + BeanSproutTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}