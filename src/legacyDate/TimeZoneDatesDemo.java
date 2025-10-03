package legacyDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDatesDemo {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String formattedDate = dateFormat.format(new Date());
        System.out.println(formattedDate);

        dateFormat.setTimeZone(TimeZone.getTimeZone("US/East-Indiana"));
        String formattedDate1 = dateFormat.format(new Date());
        System.out.println(formattedDate1);


        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("US/East-Indiana"));
        System.out.println(gregorianCalendar.getTime());
        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hour = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minute = gregorianCalendar.get(Calendar.MINUTE);
        int second = gregorianCalendar.get(Calendar.SECOND);
        int millisecond = gregorianCalendar.get(Calendar.MILLISECOND);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(millisecond);

    }
}