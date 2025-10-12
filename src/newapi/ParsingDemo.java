package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dateString  = "2025-08-30"; // yyyy-MM-dd
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        System.out.println(localDate);

        String timeString = "10:30:40"; // HH:mm:ss
        LocalTime localTime = LocalTime.parse(timeString, formatter1);
        System.out.println(localTime);

        String dateTimeString = "30/08/2025 10:30:40"; // dd/MM/yyyy HH:mm:ss
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter2);
        System.out.println(localDateTime);
    }
}
