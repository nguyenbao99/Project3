package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class CaramelTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public CaramelTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + CaramelTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}