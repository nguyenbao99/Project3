package Stores;

import java.util.*; 
import Rolls.*;
import Extras.*; 
import Extras.Fillings.*;
import Extras.Sauces.*;
import Extras.Toppings.*;
import Customers.*;


/* Base class for all types of restaurants that specialize in rolls  */
public abstract class RollStore {

    /* at the end we need to log total money made from all rolls and total money generated from types of customers */
    HashMap<String, Double> totalRollSales = new HashMap<String, Double>(); /* monthly roll tracker */
    HashMap<String, Double> totalCustomerSales = new HashMap<String, Double>(); /* monthly customer tracker payment */
    public int totalShortageImpact = 0;            

    /* Use these to generate daily statistics, gets reset daily */
    HashMap<String, Integer> dailyRollInventory = new HashMap<String, Integer>(); /* daily inventory */
    HashMap<String, Double> dailyCustomerSales = new HashMap<String, Double>(); /* daily inventory */
    Order[] dailyOrders = new Order[150];
    private int dailyShortageImpact = 0;
    public int orderCount = 0;                       

    private RollFactory factory; /* Delegate for roll creation */

    /* 
        totalRollSales = monthly tracking for how much was made from each type of roll
        dailyRollInventory = inventory for each roll
        dailyCustomerSales = daily tracking for how much each type of customer has paid
        totalCustomerSales = monthly tracking for how much each type of customer has paid overall
        dailyOrders = array for all the order that contain the order + all the toppings.         
    
    */
    public void addOrder(String customer, Roll original, Roll rollWithToppings, Double rollCost) {
        Order newOrder = new Order(customer, rollWithToppings, rollCost);  // just for printing 
        Double originalTotal = totalRollSales.get(original.getDescription());

       
        /* update the daily dictionary trackers */
        totalRollSales.replace(original.getDescription(), originalTotal + rollCost);                  // update total monthly total for given roll     
        dailyRollInventory.replace(original.getDescription(), dailyRollInventory.get(original.getDescription()) - 1);  // remove one from inventory 
        dailyCustomerSales.replace(customer, dailyCustomerSales.get(customer) + rollCost); // updating daily payment from type of customer 
        totalCustomerSales.replace(customer, totalCustomerSales.get(customer) + rollCost);
        dailyOrders[orderCount] = newOrder;
        orderCount = orderCount + 1;
    }

    /* reset all daily variables */
    public void resetDailyTrackers() {
        totalShortageImpact = totalShortageImpact + dailyShortageImpact; 
        dailyCustomerSales.put("Casual", 0.0);
        dailyCustomerSales.put("Business", 0.0);
        dailyCustomerSales.put("Catering", 0.0);
        dailyShortageImpact = 0; 
        orderCount = 0;
    }

    public void incrementShortage() {
        dailyShortageImpact = dailyShortageImpact + 1;
    }

    /* prints inventory, should happen at the start and end of the day */
    public void printInventory() {
        String rollType = "";   /* going to have to log this somehow */
        int rollInventory = 0;
        for (Map.Entry<String,Integer> entry : dailyRollInventory.entrySet()) {
            rollType = entry.getKey();
            rollInventory = entry.getValue();
            System.out.println(rollType + " " + rollInventory);
        }
    }

    public abstract void refreshRoll(String _roll);

    public abstract boolean checkInventory(String _roll, int wantedAmount);  

    public abstract void printMonthlySummary();

    public abstract void printDailySummary();

    public abstract boolean indicateClosure();
}