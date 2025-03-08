package priority;

class Customer implements Comparable<Customer>{
    private String name;
    private int priorityLevel;
    private String pickupTime;

    public Customer(String name, int priorityLevel, String pickupTime){
        this.name=name;
        this.priorityLevel=priorityLevel;
        this.pickupTime=pickupTime;
    }

    public int getPriorityLevel(){
        return priorityLevel;
    }

    public String getPickupTime(){
        return pickupTime;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Customer other){
        return Integer.compare(other.priorityLevel, this.priorityLevel);
    }
}
