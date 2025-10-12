package newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 12, 30);
        LocalDate localDate1 = localDate.of(2021, 11, 20);
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);

        Period oneYearTwoMonth = Period.of(1,2,0);
        System.out.println(oneYearTwoMonth);
        Period threeDays = Period.ofDays(3);
        LocalDate localDate2 = localDate.plus(threeDays);
        System.out.println(localDate2);

    }
}
