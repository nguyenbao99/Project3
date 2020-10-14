package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class FruitTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public FruitTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + FruitTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}