package legacyDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatingDemo {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate1 = dateFormat1.format(currentDate);
        System.out.println(formattedDate1);

        String dateString = "2025-08-30 00:00:00"; // yyyy-MM-dd HH:mm:ss
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date formattedDate2 = dateFormat2.parse(dateString);
        System.out.println(formattedDate2);

    }
}
