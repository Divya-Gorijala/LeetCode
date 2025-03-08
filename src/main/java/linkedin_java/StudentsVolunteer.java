package linkedin_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsVolunteer {
    public static void main(String[] args) {
        List<String> students = List.of("Sally","Polly","Molly","Tony","Harry");
        Map<String,List<String>> attendeesMapping = Map.of("Farmer's Market",List.of("Sally","Polly"),
        "Car Wash Fundraiser",List.of("Molly","Tony","Polly"),
        "Cooking Workshop", List.of("Sally","Molly","Polly"),
         "Midnight Breakfast", List.of("Polly","Molly"));
        System.out.println(findStudentWithIncompleteVolunteer(students,attendeesMapping));
    }

    private static List<String> findStudentWithIncompleteVolunteer(List<String> students, Map<String, List<String>> attendeesMapping) {
        HashMap<String,Integer> hMap = new HashMap<>();
        //initialize the count for each student
        for(String student: students){
            hMap.put(student,0);
        }
        for(List<String> atendees :attendeesMapping.values()){
            for(String student: atendees){
                hMap.put(student, hMap.get(student)+1);
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: hMap.entrySet()){
            if(entry.getValue()<2){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
