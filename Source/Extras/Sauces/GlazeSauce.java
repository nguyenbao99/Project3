package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class GlazeSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public GlazeSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + GlazeSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}