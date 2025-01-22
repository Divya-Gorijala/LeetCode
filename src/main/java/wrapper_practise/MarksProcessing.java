package wrapper_practise;

import java.util.ArrayList;
import java.util.List;

public class MarksProcessing {
    public static void main(String[] args) {
        // Create a List to store marks
        List<Integer> marks = new ArrayList<>();

        // Adding primitive int values (Autoboxing occurs here)
        marks.add(85);  // int to Integer
        marks.add(90);
        marks.add(78);

        // Calculate total marks (Unboxing occurs during addition)
        int totalMarks = 0;
        for (int mark : marks) { // Integer to int
            totalMarks += mark;
        }

        // Calculate average
        double average = (double) totalMarks / marks.size();

        // Display results
        System.out.println("Marks: " + marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
    }
}
