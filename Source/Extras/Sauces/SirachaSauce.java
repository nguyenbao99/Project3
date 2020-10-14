package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class SirachaSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public SirachaSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + SirachaSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}