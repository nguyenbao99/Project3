package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class MapleSyrupSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public MapleSyrupSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + MapleSyrupSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}