package streams_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        //map to squares
        List<Integer> squares= list1.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(squares);
    }
}
