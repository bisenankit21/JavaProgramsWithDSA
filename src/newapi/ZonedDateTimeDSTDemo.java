package newapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDSTDemo {
    public static void main(String[] args) {
        ZonedDateTime departure = ZonedDateTime.of(2015, 3, 3, 3, 3, 3, 3, ZoneId.of("America/New_York"));
        ZonedDateTime arrival = departure.plusHours(4).withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(departure);
        System.out.println();
        System.out.println(arrival);
    }
}
