package legacyDate;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderdEMO {
    public static void main(String[] args) {
        Calendar currentDate =  Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2100, Calendar.JANUARY, 1);
        System.out.println(currentDate);
        System.out.println(gregorianCalendar);
        Date currentDate1 = currentDate.getTime();
        System.out.println(currentDate1);

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

        gregorianCalendar.set(Calendar.YEAR, 2011);
        gregorianCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        Date currentDate2 = gregorianCalendar.getTime();
        System.out.println(currentDate2);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MMMM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formattedDate);

        gregorianCalendar.add(Calendar.HOUR,2);
        String formattedDate1 = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formattedDate1);

        gregorianCalendar.add(Calendar.MONTH, -2);
        String formattedDate2 = dateFormat.format(gregorianCalendar.getTime());
        System.out.println(formattedDate2);


        boolean isLeapYear = gregorianCalendar.isLeapYear(2100);
    }
}
