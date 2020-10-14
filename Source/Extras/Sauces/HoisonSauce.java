package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class HoisonSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public HoisonSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + HoisonSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}