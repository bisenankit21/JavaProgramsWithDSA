package newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GetPlusMinusDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 12, 30);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year+"-"+month+"-"+day);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDateTime  localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println(hour+"-"+minute+"-"+second);

       LocalDate localDate1 = localDate.plusDays(6);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate.minusDays(6);
        System.out.println(localDate2);

        LocalDate localDate3 = localDate.plusMonths(6);
        System.out.println(localDate3);

        LocalDate localDate4 = localDate.minusMonths(6);
        System.out.println(localDate4);

    }
}
