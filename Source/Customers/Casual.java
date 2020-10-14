package Customers;
import Customers.Customer;
import java.util.Random;
import java.util.HashMap;

public class Casual extends Customer{

 

    //method for choosing random types
    public int[] roll_order(int []order_summary){
        Random rand = new Random();
        order_summary[0] = rand.nextInt(5); //determines type of roll 
        order_summary[1] = rand.nextInt(3)+1; //determines if they want 1,2, or 3 rolls
        return order_summary;
    }
    
    /* this order for Casual customers whill choose two random numbers.
    The First number is to determine the type of roll, the second number determines the quanity. To pick the random number we use roll_order function above
    Switch case is used to determine what the roll was and quantity, then update their variables as well as returns string of their order
    */
    @Override
    public HashMap<String, Integer> order(){
        int []order_type = new int[2];
        order_type = roll_order(order_type);
        int type = order_type[0];
        String Order_Summary = " ";
        HashMap<String, Integer> CasualCustomerOrder = new HashMap<String, Integer>();//to return the map of what is ordered by casual customer
        switch (type){
            case 0: //egg rolls
                CasualCustomerOrder.put("Egg roll", order_type[1]);
                break;
            case 1: // Jelly Rolls
                CasualCustomerOrder.put("Jelly roll", order_type[1]);
                break;
            case 2: // Pastry Rolls
                CasualCustomerOrder.put("Pastry roll", order_type[1]);
                break;
            case 3: // sausage Rolls
                CasualCustomerOrder.put("Sausage roll", order_type[1]);
                break;
            case 4: // spring Rolls
                CasualCustomerOrder.put("Spring roll", order_type[1]);
                break;
            default:
                Order_Summary = "Error";
                break;
        }
        //System.out.println(Order_Summary);
        return CasualCustomerOrder;

    }

}