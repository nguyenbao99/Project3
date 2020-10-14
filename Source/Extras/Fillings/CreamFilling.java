package Extras.Fillings;
import Rolls.*;
import Extras.*;

public class CreamFilling extends Extras {
    final Double price = 0.50;
    
    /* Decorating */
    public CreamFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + CreamFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}