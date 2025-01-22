package map_practise;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Alice",32);
        map.put("Bob",25);
        map.put("Charlie",35);
        System.out.println(map.get("Alice"));
        //map.remove("Bob");
        System.out.println(map.containsKey("Alice"));
        System.out.println(map.containsValue(25));
        //iterate over a map
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
}
