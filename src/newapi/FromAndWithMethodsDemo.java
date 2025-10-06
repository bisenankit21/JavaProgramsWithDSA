package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class FromAndWithMethodsDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.DECEMBER, 18,22,30);
        System.out.println(dateTime);

        LocalDate derivedDate = LocalDate.from(dateTime);
        LocalTime derivedTime = LocalTime.from(dateTime);
        System.out.println(derivedTime);
        System.out.println(derivedDate);

        LocalDateTime dateTime1 = dateTime.withYear(2025);
        LocalDateTime dateTime2 = dateTime.withMonth(9);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }
}
