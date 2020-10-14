package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class TomatoeFilling extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public TomatoeFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + TomatoeFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}