class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
public class CallByReferenceExample {
    public static void modify(Person person){
        person.name="John";
    }
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println("Before Modifying : "+ p.name);
        modify(p);
        System.out.println("After Modifying : "+p.name);
    }
}


