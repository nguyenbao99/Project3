package Customers;
import java.util.Random;
import java.util.HashMap;

public abstract class Customer{

    /* This gets the type of customer, the next one gets the type of customerA: I.E. business, casual, catering*/

    public String getType(){
        return this.getClass().getSimpleName();
    }


    /* this is the string order that tells what the customer bought
    The method returns a hashmap where typeRoll -> quantity
    this allows us to tell how much they ordered and can do "get" on the roll they ordered
    */
    public abstract HashMap<String, Integer> order();
}