package Extras.Fillings;
import Rolls.*;
import Extras.*;

public class ExtraMeatFilling extends Extras {
    final Double price = 1.25;
    
    /* Decorating */
    public ExtraMeatFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + ExtraMeatFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}