package linkedin_java;

import java.util.Locale;
import java.util.Map;

public class LetterPoints {
    public static final Map<Character, Integer> letterPoints = Map.ofEntries(
            Map.entry('A', 1), Map.entry('B', 3), Map.entry('C', 3), Map.entry('D', 2),
            Map.entry('E', 1), Map.entry('F', 4), Map.entry('G', 2), Map.entry('H', 4),
            Map.entry('I', 1), Map.entry('J', 8), Map.entry('K', 5), Map.entry('L', 1),
            Map.entry('M', 3), Map.entry('N', 1), Map.entry('O', 1), Map.entry('P', 3),
            Map.entry('Q', 10), Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1),
            Map.entry('U', 1), Map.entry('V', 4), Map.entry('W', 4), Map.entry('X', 8),
            Map.entry('Y', 4), Map.entry('Z', 10)
    );

    public static void main(String[] args) {
        String word="Abcd";
        String wordInCaps=word.toUpperCase();
        //calculate points
        int sum=0;
        for (int i=0;i<word.length(); i++){
            sum=sum+letterPoints.getOrDefault(wordInCaps.charAt(i),0);
        }
        System.out.println(sum);
    }
}
