package linkedin_java;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName, int age){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age=age;
    }
    public void setAge(){
        age=age;
    }
    public int getAge(){
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void introduceYourself() {
        System.out.println("My name is "+getFirstName()+" "+getLastName()+" and I'm "+getAge());
    }
}
