package linkedin_java;

import java.time.LocalDate;

public class DateFromNow {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.plusDays(100));
    }
}
