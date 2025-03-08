package linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListShopping {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1,"mango");
        System.out.println(shoppingList);
        System.out.println(shoppingList.get(2));
        //make List synchronized
        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
