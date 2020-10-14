package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class PeanutSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public PeanutSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + PeanutSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}