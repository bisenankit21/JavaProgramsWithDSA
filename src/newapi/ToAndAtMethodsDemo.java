package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ToAndAtMethodsDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.DECEMBER, 18,22,30);
        System.out.println(dateTime);

        LocalDate derivedDate = dateTime.toLocalDate();
        LocalTime derivedTime = dateTime.toLocalTime();
        System.out.println(derivedTime);
        System.out.println(derivedDate);

        LocalDate localDate = LocalDate.of(2015, Month.DECEMBER, 18);
        LocalDateTime localDateTime = localDate.atStartOfDay();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDate.atTime(18,20);
        System.out.println(localDateTime1);


    }
}
