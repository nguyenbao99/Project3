package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class FishSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public FishSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + FishSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}