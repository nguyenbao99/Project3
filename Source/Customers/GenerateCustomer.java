package Customers;
import java.util.Random;
import java.util.HashMap;



public class GenerateCustomer{
    //Methods for the object, keeps track of how many customers are queued up
    private int Customer_Count;
    private Customer[] Customer_List = new Customer[18];

    // Constructor to generate the class uses the function defined below
    public GenerateCustomer(){
        refreshList();

    }

    public int getCustomerCount(){
        return this.Customer_Count;
    }

    public void setCustomerCount(int custCount){
        this.Customer_Count = custCount;
    }

    public Customer[] getListCustomer(){
        return this.Customer_List;
    }

    /*
    This function will create up to 18 different customers and will put into the customer_list array.
    It adds a customer object into the customer_list array
     */
    public void refreshList(){
        Random rand = new Random();
        int casual_amount = rand.nextInt(12)+1;
        int business_amount = rand.nextInt(3)+1;
        int catering_amount = rand.nextInt(3)+1;
        int total = casual_amount + business_amount + catering_amount;
        setCustomerCount(total);
        for (int i = 0; i < total; i++){
            String name = "customer" + i;
            if(casual_amount > 0){
                Customer_List[i] = new Casual();
                casual_amount = casual_amount -1;
            }
            else if (business_amount > 0){
                Customer_List[i] = new Business();
                business_amount = business_amount -1;
            }
            else{
                Customer_List[i] = new Catering();

            }
        }
    }
}
