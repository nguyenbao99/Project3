package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class VanillaSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public VanillaSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + VanillaSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}