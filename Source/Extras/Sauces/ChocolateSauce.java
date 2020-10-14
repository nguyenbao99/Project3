package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class ChocolateSauce extends Extras {
    final Double price = 0.25;

    /* Decorating */
    public ChocolateSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + ChocolateSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price;
    }
}