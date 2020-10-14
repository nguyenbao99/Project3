package Extras.Toppings;
import Rolls.*;
import Extras.*;

public class CucumberTopping extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public CucumberTopping(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + CucumberTopping";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}