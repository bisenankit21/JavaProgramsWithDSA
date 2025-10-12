package newapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TruncatedToMethodDemo {
    Duration duration = Duration.ofDays(28).plusHours(6).plusMinutes(40).plusSeconds(10);
    Duration daysTruncatedDuration = duration.truncatedTo(ChronoUnit.DAYS);
    Duration hoursTruncatedDuration = duration.truncatedTo(ChronoUnit.HOURS);
    Duration minutesTruncatedDuration = duration.truncatedTo(ChronoUnit.MINUTES);
    Duration secondsTruncatedDuration = duration.truncatedTo(ChronoUnit.SECONDS);


}
