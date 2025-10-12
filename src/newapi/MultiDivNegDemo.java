package newapi;

import java.time.Duration;
import java.time.Period;

public class MultiDivNegDemo {
    public static void main(String[] args) {
        Duration originalDuration =Duration.ofMinutes(30);
        Duration multipliedDuration =originalDuration.multipliedBy(3);
        Duration dividedDuration =originalDuration.dividedBy(2);
        Duration negatedDuration =originalDuration.negated();
        System.out.println(multipliedDuration);
        System.out.println(dividedDuration);
        System.out.println(negatedDuration);

        Period originalPeriod = Period.ofDays(3);
        Period multipliedPeriod =originalPeriod.multipliedBy(3);
        Period negatedPeriod =originalPeriod.negated();
        System.out.println(multipliedPeriod);
        System.out.println(negatedPeriod);
    }
}
