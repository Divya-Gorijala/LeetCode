package streams_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("1","2","3"),
                Arrays.asList("4","5","6"),
                Arrays.asList("7","8","9")
        );
        List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
