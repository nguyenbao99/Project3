package Customers;
import Customers.Customer;
import java.util.HashMap;
import java.util.Random;

public class Catering extends Customer{

    //method for choosing random types
    public int[] roll_order(){
        Random rand = new Random();
        int[] numRolls = new int[3];
        numRolls[0] = rand.nextInt(5); //determines type of roll 1
        numRolls[1] = rand.nextInt(5);//determines type of roll 2
        numRolls[2] = rand.nextInt(5);//determines type of roll 3
        while((numRolls[2] == numRolls[1]) || (numRolls[2] == numRolls[0]) || (numRolls[0] == numRolls[1]) ){
            numRolls[2] = rand.nextInt(5);
            numRolls[1] = rand.nextInt(5);
        }


        return numRolls;
    }
    /* this order for Catering customers whill choose three different random numbers.
    Each number corresponds to the different kinds of rolls they want. They would get 5 of 3 different rolls, for a total of 15 rolls
    returns the string of what was ordered. Also updates the kind of rolls that were bought
    */
    @Override
    public HashMap<String, Integer> order(){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Egg roll");
        map.put(1, "Jelly roll");
        map.put(2, "Pastry roll");
        map.put(3, "Sausage roll");
        map.put(4, "Spring roll");
        HashMap<String, Integer> CateringCustomersOrder = new HashMap<String, Integer>();//to return the map of what is ordered from catering customer
        int roll_types[] = roll_order();
        //String Order_Summary = String.format("%s customer ordered: 5 %s, 5 %s, 5 %s", this.getType(), map.get(roll_types[0]), map.get(roll_types[1]), map.get(roll_types[2]));
        //System.out.println(Order_Summary);

        // put (map.get(roll_types[0]), 5 ) the map.get... is returning the type of roll ordered, and catering customers order 5
        CateringCustomersOrder.put(map.get(roll_types[0]), 5);
        CateringCustomersOrder.put(map.get(roll_types[1]), 5);
        CateringCustomersOrder.put(map.get(roll_types[2]), 5);
        return CateringCustomersOrder;

        }
}
