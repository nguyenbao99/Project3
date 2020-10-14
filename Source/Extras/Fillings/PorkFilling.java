package Extras.Fillings;
import Rolls.*;
import Extras.*;

public class PorkFilling extends Extras {
    final Double price = 1.25;
    
    /* Decorating */
    public PorkFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + PorkFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}