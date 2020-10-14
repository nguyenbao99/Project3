import Extras.Fillings.ExtraMeatFilling;
import Extras.Sauces.ChocolateSauce;
import Extras.Sauces.SirachaSauce;
import Rolls.Roll;
import Rolls.RollFactory;
import Stores.ZachsRollStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import Customers.*;
import Rolls.*;
import Stores.*;
import Extras.Toppings.*;
import java.util.HashMap;
//import Rolls.*;

public class MyUnitTest {

    /*Checks to see if Egg Roll is made with the correct name
    * */
    @Test
    public void testMakeEggRoll(){
        // the first three lines simulate creating the objects found in Main java
        RollFactory factory = new RollFactory();
        Roll egg = factory.makeRoll("Egg roll");
        assertEquals("Egg roll",egg.getDescription());
    }

    /*Checks to see if cusomter array size does not exceed 18. 18 is limit for 1 day
     * */
    @Test
    public void testCustomerPeople(){
        GenerateCustomer newCust = new GenerateCustomer();
        assertTrue(18 >= newCust.getCustomerCount());
    }

    /*Checks to see if new store made would close right away before any sells
     * */
    @Test
    public void testClosure(){
        RollFactory factory = new RollFactory();
        ZachsRollStore s1 = new ZachsRollStore(factory);
        s1.init_store();
        boolean output = s1.indicateClosure();
        assertEquals(false, output);
    }
    @Test
    void test2(){
        RollFactory factory = new RollFactory();
        Roll egg = factory.makeRoll("Egg roll");
        ZachsRollStore s1 = new ZachsRollStore(factory);
        s1.init_store();
        assertEquals(1.25, egg.getPrice());
    }
    @Test
    void test3(){
        RollFactory factory = new RollFactory();
        Roll egg = factory.makeRoll("Egg roll");
        Roll wsir = new SirachaSauce(egg);
        double price = wsir.getPrice();
        assertEquals(1.5, price);
    }

    @Test
    void test4(){
        RollFactory factory = new RollFactory();
        Roll jelly = factory.makeRoll("Jelly roll");
        Roll meat = new ExtraMeatFilling(jelly);
        double price = meat.getPrice();
        assertEquals(3.25, price);
    }
    @Test
    void test5(){
        RollFactory factory = new RollFactory();
        Roll egg = factory.makeRoll("Egg roll");
        Roll meat = new ExtraMeatFilling(egg);
        String desc = meat.getDescription();
        assertEquals("Egg roll + ExtraMeatFilling", desc);
    }
    /*Checks to see if Business customer had pastry roll of 2
     * */
    @Test
    public void testBuinessCust(){
        Business cust = new Business();
        HashMap<String, Integer> check =  cust.order();
        assertEquals(2,check.get("Pastry roll"));
    }

    /*Checks to see if price is correct for roll and topping
     * */
    @Test
    public void testRollWithTopping(){
        RollFactory factory = new RollFactory();
        Roll jelly = factory.makeRoll("Jelly roll");
        Roll jellyWithCandy = new CandyTopping(jelly);
        assertEquals(2.25, jellyWithCandy.getPrice());
    }

    /*Checks to see if Catering Customer's total order is 15
     * */
    @Test
    public void TestCatering(){
        Catering cust = new Catering();
        HashMap<String, Integer> check =  cust.order();
        int count = 0;
        for (String i : check.keySet()){
            count = count + check.get(i);
        }
        assertEquals(15, count);
    }





}
