package newapi;

import java.time.*;

public class OfMethodsDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.DECEMBER, 30);
        LocalTime time = LocalTime.of(10, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime1 = LocalDateTime.of(2025, Month.DECEMBER, 30, 10, 30);
        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime dateTimeWithZone = ZonedDateTime.of(2015,3,3,3,3,3,3,newYorkTimeZone);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(dateTime1);
        System.out.println(dateTimeWithZone);

        LocalDate date1 = LocalDate.ofEpochDay(1000);
        LocalDate date2= LocalDate.ofYearDay(2025, 100);
        System.out.println(date1);
        System.out.println(date2);
    }

}
