package streams_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to uppercase.
public class MapUpperCase {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","grapes","mango");
        List<String> capitalWords=words.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(capitalWords);
    }
}
