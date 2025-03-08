package linkedin_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsVolunteerFlatMap {
    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry");
        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));
        System.out.println(findStudentWithIncompleteVolunteer(students, attendeesMapping));
    }

    private static List<String> findStudentWithIncompleteVolunteer(List<String> students, Map<String, List<String>> attendeesMapping) {
        Map<String, Long> volunteerCount = attendeesMapping.values().stream().flatMap(List::stream)
                .collect(Collectors.groupingBy(student -> student, Collectors.counting()));
        List<String> result = students.stream().filter(student -> volunteerCount.getOrDefault(student,0L) < 2)
                .collect(Collectors.toList());
        return result;
    }
}
