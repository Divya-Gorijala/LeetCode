package priority;

class Driver {
    private String name;
    public Driver(String name){
        this.name=name;
    }

    public void assignPickup(Customer customer){
        System.out.println("Driver "+name+" assigned to pick up "+customer.getName()+" at "+customer.getPickupTime());
    }
}
