package Stores;

import java.util.*; 
import Rolls.*;
import Extras.*; 
import Extras.Fillings.*;
import Extras.Sauces.*;
import Extras.Toppings.*;
import Customers.*;

/* defines the basic structure of a customers final order */
public class Order {
    private String customer;
    private Roll roll; 
    private Double orderCost;

    Order (String cust, Roll givenRoll, Double cost) {
        setCustomer(cust); 
        setOrder(givenRoll);
        setCost(cost);
    }


    public void setCustomer(String _cust) { this.customer = _cust; }
    public void setOrder(Roll _roll) { this.roll = _roll; }
    public void setCost(Double _cost) { this.orderCost = _cost; } 

    public String getCustomer() {
        return customer;
    }
    public String getOrder() {
        return roll.getDescription();
    }
    public Double getCost() {
        return orderCost;
    }
}