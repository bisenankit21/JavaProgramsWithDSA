package newapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant i1 = Instant.ofEpochSecond(1000); //it gives the time after 1000 sec of unix epoch time
        System.out.println(i1);

        Instant i2= Instant.now();
        System.out.println(i2);

        long epochSecond = i2.getEpochSecond();
        System.out.println(epochSecond);

        long nanoSecond = i2.getNano();
        System.out.println(nanoSecond);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        Duration duration = Duration.ofDays(5);
        Duration duration1 = Duration.ofHours(5);
        Duration duration2 = Duration.ofMinutes(5);
        Duration duration3 = Duration.ofSeconds(5);
        Duration duration4 = Duration.ofMillis(5);
        Duration duration5 = Duration.ofNanos(5);
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);

        Instant i3 = i1.plus(duration1);
        Instant i4 = i2.minus(duration2);
        System.out.println(i3);
        System.out.println(i4);

        boolean isAfter = i3.isAfter(i4);
        boolean isBefore = i3.isBefore(i4);
        System.out.println(isAfter);
        System.out.println(isBefore);

        Duration duration6 = Duration.between(i1, i3);
        System.out.println(duration6);
    }
}
