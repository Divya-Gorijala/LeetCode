package priority;

import java.util.ArrayList;
import java.util.List;

public class PickupSystem {
    public static void main(String[] args) {
        Customer customer1=new Customer("Alice",2,"10:00AM");
        Customer customer2=new Customer("Bob",5,"10:00AM");

        List<Customer> customers=new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        //Create a driver
        Driver driver= new Driver("John");

        //Schedule the pickup
        PickupScheduler.schedulePickup(customers,driver);
    }
}
