package data_structures_practise;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        //Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Print the ArrayList
        System.out.println("Fruits List: "+fruits);

        //Access an element by Index
        System.out.println("First fruit: "+fruits.get(0));

        //Remove an element by index
        fruits.remove(1);
        System.out.println("Fruits List after removal: "+fruits);

        //Get the size of ArrayList
        System.out.println("Size of the element "+fruits.size());

        // Check if a certain element exists in the list
        System.out.println("Contains 'Cherry': "+fruits.contains("Cherry"));
    }
}
