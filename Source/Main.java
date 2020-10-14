import java.util.Scanner;
import java.io.*;
import java.util.*;
import Stores.*;
import Rolls.*;
import Customers.*;
//import MyUnitTest.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Starting Restaurant Simulation.");

        /* Instantiating required objects */
        GenerateCustomer c_gen = new GenerateCustomer(); 
        RollFactory factory = new RollFactory();
        ZachsRollStore s1 = new ZachsRollStore(factory);
        Customer[] customerSet = c_gen.getListCustomer();


        int dayCount = 0;
        System.out.println("------- Day: " + dayCount + " -------");
        s1.printMorningInventory();
        for (int i = 0; i < c_gen.getCustomerCount(); i++) {  /* iterate through all customers*/
            Customer currentCustomer = customerSet[i];
            HashMap<String, Integer> currentOrder = currentCustomer.order();
            String custType = currentCustomer.getType();
            String[] rolls = new String[15];
            int orderCount = 0;
            // grab all the keys for that order 
            for (Map.Entry<String,Integer> entry : currentOrder.entrySet()) {
                rolls[orderCount] = entry.getKey();
                orderCount = orderCount + 1;
            } 

            for (int j = 0; i < currentOrder.size(); i++) {
                boolean hasEnough = s1.checkInventory(rolls[j], currentOrder.get(rolls[j]));
                if (hasEnough == true) {
                    Roll wantedRoll = s1.makeRoll(rolls[j]);
                    s1.addOrder(custType, wantedRoll, wantedRoll, 1.0);
                    // add something to handle adding all the toppings
                }
                else {
                    s1.incrementShortage();
                }
            }
        }
        s1.printDailySummary();
        s1.resetDailyTrackers();
        dayCount = dayCount + 1;
        System.out.println("");
        
    }
    
}
