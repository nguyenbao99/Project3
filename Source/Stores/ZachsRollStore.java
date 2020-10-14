package Stores;

import java.util.*; 
import Rolls.*;
import Extras.*; 
import Extras.Fillings.*;
import Extras.Sauces.*;
import Extras.Toppings.*;
import Customers.*;


public class ZachsRollStore extends RollStore {

    /* Constants */
    final int MAX_ROLL_COUNT = 30;

    private RollFactory factory; /* Delegate for roll creation */

    /* Constructor, currently it just sets the delegate */
    public ZachsRollStore(RollFactory _factory) {
        this.factory = _factory;
        init_store();
    }

    /* gets called once per simulation */
    public void init_store() {
        /* init inventory dictionary*/ 
        System.out.println("Initializing Store");
        dailyRollInventory.put("Egg roll", MAX_ROLL_COUNT);
        dailyRollInventory.put("Jelly roll", MAX_ROLL_COUNT);
        dailyRollInventory.put("Pastry roll", MAX_ROLL_COUNT);
        dailyRollInventory.put("Sausage roll", MAX_ROLL_COUNT);
        dailyRollInventory.put("Spring roll", MAX_ROLL_COUNT);

        /* init totalRollSales for the month */
        totalRollSales.put("Egg roll", 0.0);
        totalRollSales.put("Jelly roll", 0.0);
        totalRollSales.put("Pastry roll", 0.0);
        totalRollSales.put("Sausage roll", 0.0);
        totalRollSales.put("Spring roll", 0.0);

        /* init totalCustomerSales for the month */
        totalCustomerSales.put("Casual", 0.0);
        totalCustomerSales.put("Business", 0.0);
        totalCustomerSales.put("Catering", 0.0);

        /* init daily customer sales */
        dailyCustomerSales.put("Casual", 0.0);
        dailyCustomerSales.put("Business", 0.0);
        dailyCustomerSales.put("Catering", 0.0);
        
    }

     /* replenishes given roll one the next day */
    public void refreshRoll(String _roll) {
        dailyRollInventory.replace(_roll, 30);
        System.out.println("Refreshed " + _roll);
    }

    /* returns boolean if amount of rolls are available for that type */
    public boolean checkInventory(String _roll, int wantedAmount) {
        int quantity = dailyRollInventory.get(_roll);
        if (wantedAmount <= quantity) {
            return true;
        } 
        return false;
    }

    /* returns true if the day should end */
    /* only call this if a roll runs out */
    public boolean indicateClosure() {
        int count = dailyRollInventory.size();
        for (Map.Entry<String,Integer> entry : dailyRollInventory.entrySet()) {
            if (entry.getValue() == 0) {
                count = count - 1;
            }
        }
        if (count == 0) {
            // CLOSURE
            System.out.println("Out of rolls for the day closing shop.");
            // refresh all the rolls
            for (Map.Entry<String,Integer> entry : dailyRollInventory.entrySet()) {
                refreshRoll(entry.getKey());
            }
            return true;
        }
        return false;
    }


    /* called at the end of each day, create a printer that prints out to the .out file via observer */
    /*  print the following     
            - Total payment for orders for the day by customer type 
            - Overally total daily payment  
    */
    public void printMonthlySummary() {
        System.out.println("");
        System.out.println("");
        System.out.println("------- Total Rolls Sold -------");
        double totalRollsSold = totalRollSales.get("egg") + totalRollSales.get("jelly") + totalRollSales.get("pastry") + totalRollSales.get("sausage") + totalRollSales.get("spring");
        double egg = totalRollSales.get("egg");
        double jelly = totalRollSales.get("jelly");
        double pastry = totalRollSales.get("pastry");
        double sausage = totalRollSales.get("sausage");
        double spring = totalRollSales.get("spring");
        System.out.println("Total Rolls Sold: " +  totalRollsSold);
        System.out.println("Total EggRolls Sold: " +  egg);
        System.out.println("Total JellyRolls Sold: " +  jelly);
        System.out.println("Total PastryRolls Sold: " +  pastry);
        System.out.println("Total SausageRolls Sold: " +  sausage);
        System.out.println("Total SpringRolls Sold: " +  spring);
        System.out.println("");
        

        System.out.println("------- Total Monthly Income -------");
        double totalSales = 0; 
        totalSales = totalCustomerSales.get("Casual") + totalCustomerSales.get("Business") + totalCustomerSales.get("Catering"); 
        System.out.println("");
        System.out.println("------- Total Roll Outage Impacts -------");
        System.out.println(totalShortageImpact);
    }

    public void printMorningInventory() {
        System.out.println("------- Morning Inventory -------");
        printInventory();
        System.out.println("");
    }

    public void printDailySummary() {       
        System.out.println("------- All Orders Today -------");
        for (int i = 0; i < orderCount; i++) {
            String CustomerType = dailyOrders[i].getCustomer();
            String rollOrder = dailyOrders[i].getOrder();
            Double getCost = dailyOrders[i].getCost();
            System.out.println(CustomerType + " " + rollOrder + " " + getCost);
        }
        System.out.println("");
        System.out.println("------- Customer Payment Data -------");
        for (Map.Entry<String,Double> entry : dailyCustomerSales.entrySet()) {
            System.out.println(entry.getKey() + " paid a total of " + entry.getValue());
        } 
        System.out.println("");
        System.out.println("------- Afternoon Inventory -------");
        printInventory();
        // indicate if the store closed that day 
    }

    public Roll makeRoll(String name) {
        return factory.makeRoll(name);
    }

}