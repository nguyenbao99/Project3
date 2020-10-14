package Customers;
import Customers.Customer;
import java.util.HashMap;

public class Business extends Customer{


    /* the order consist of 2 of every roll */
    /* this order for businesses will always be the same*/
    @Override
    public HashMap<String, Integer> order(){
        //String orderSummary = String.format("%s Customer ordered: %d egg rolls, %d jelly rolls, %d pastry rolls, %d sausage rolls, and %d spring rolls",this.getType(), this.getEggRoll(), this.getPastryRoll(), this.getJellyRoll(), this.getSausageRoll(), this.getSpringRoll());
        //System.out.println(ret);
        HashMap<String, Integer> BusinessCustomersOrder = new HashMap<String, Integer>();//to return the map of what is needed
        // hasmap will look like eggroll - wants 2 rolls or something like that
        BusinessCustomersOrder.put("Egg roll", 2);
        BusinessCustomersOrder.put("Jelly roll", 2);
        BusinessCustomersOrder.put("Pastry roll", 2);
        BusinessCustomersOrder.put("Sausage roll", 2);
        BusinessCustomersOrder.put("Spring roll", 2);
        return BusinessCustomersOrder;
    }
}