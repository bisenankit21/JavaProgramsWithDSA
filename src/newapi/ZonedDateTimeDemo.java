package newapi;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ZoneId destZone = ZoneId.of("America/Chicago");
        ZonedDateTime indiaDateTime = ZonedDateTime.now(zone);
        ZonedDateTime usDateTime = indiaDateTime.withZoneSameInstant(destZone);
        System.out.println("India Time = " + indiaDateTime);
        System.out.println("US Time = " + usDateTime);

        ZoneOffset offset = ZoneOffset.ofHours(2);
        ZoneOffset destOffset = ZoneOffset.ofHours(-5);

        ZonedDateTime indiaDateTime1 = ZonedDateTime.now(zone);
        ZonedDateTime usDateTime1 = indiaDateTime1.withZoneSameInstant(destOffset);
        System.out.println("India Time = " + indiaDateTime1);
        System.out.println("US Time = " + usDateTime1);
    }


}


