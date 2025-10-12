package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 12, 30);
        LocalTime localTime = LocalTime.of(10, 30, 40);
        LocalDateTime localDateTime = LocalDateTime.of(2025, 12, 30, 10, 30, 40);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //To format the date.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = dateTimeFormatter.format(localDate);
        System.out.println(formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime = timeFormatter.format(localTime);
        System.out.println(formattedTime);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String formattedDateTime = dateTimeFormatter1.format(localDateTime);
        System.out.println(formattedDateTime);


        String formattedDate1 = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate1);


        DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        String formattedDate2 = localDate.format(germanFormatter);
        System.out.println(formattedDate2);
    }
}
