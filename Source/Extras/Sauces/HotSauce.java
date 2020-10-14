package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class HotSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public HotSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + HotSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}