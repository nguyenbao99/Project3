package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class LettuceTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public LettuceTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + LettuceTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}