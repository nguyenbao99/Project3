package Extras.Fillings;
import Rolls.*;
import Extras.*;

public class EggFilling extends Extras {
    final Double price = 0.50;
    
    /* Decorating */
    public EggFilling(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + EggFilling";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}