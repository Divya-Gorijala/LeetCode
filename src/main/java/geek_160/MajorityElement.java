package geek_160;
//Given an array nums of size n, return the majority element.The majority element is
        //the element that appears more than ⌊n / 2⌋ times. You may assume that the
       // majority element always exists in the array.

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,6};
        HashMap<Integer,Integer> num=new HashMap<>();
        int threashold= arr.length/2;
        for (int i = 0; i < arr.length; i++) {
            num.put(arr[i], num.getOrDefault(arr[i], 0) + 1);
            if(num.get(arr[i])>threashold){
                System.out.println(arr[i]);
            }
        }

        for(Map.Entry<Integer,Integer> mp: num.entrySet()){
            if(mp.getValue()>threashold){
                //System.out.println("hi");
                System.out.println(mp.getKey());
            }
        }
    }
}
