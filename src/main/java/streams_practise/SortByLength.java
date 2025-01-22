package streams_practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByLength {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("123");
        list.add("1234");
        list.add("12");
        System.out.println(list.toString());
        List sortedList=list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortedList.toString());
    }
}
