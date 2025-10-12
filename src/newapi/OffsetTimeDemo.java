package newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo
{
    public static void main(String[] args) {
        OffsetTime time = OffsetTime.of(10, 30, 40, 50, ZoneOffset.ofHours(2));
        System.out.println(time);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        ZoneOffset offset = time.getOffset();
        System.out.println(offset);
        System.out.println(hour+"-"+minute+"-"+second);
    }
}
