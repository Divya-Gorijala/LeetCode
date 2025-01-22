package streams_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCharacters {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("hello","world");
        List<Character> characters= words.stream()
                                         .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                                         .collect(Collectors.toList());
        System.out.println(characters);
    }
}
