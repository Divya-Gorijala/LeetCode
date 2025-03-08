package priority;

import java.util.Collections;
import java.util.List;

class PickupScheduler {
    public static void schedulePickup(List<Customer> customers, Driver driver){
        // Sort customers by priority
        Collections.sort(customers);
        //Assign the driver to the highest-priority customer
        if(!customers.isEmpty()){
            Customer selectedCustomer =customers.get(0);
            driver.assignPickup(selectedCustomer);
        }
        else{
            System.out.println("No pickups scheduked.");
        }
    }
}
