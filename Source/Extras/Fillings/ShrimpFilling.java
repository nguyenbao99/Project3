package Extras.Fillings;
import Rolls.*;
import Extras.*;

public class ShrimpFilling extends Extras {
    final Double price = 1.25;
    
    /* Decorating */
    public ShrimpFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + ShrimpFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}