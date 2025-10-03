package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public static void main(String[] args) {
        Date dt = new Date(2025,11,26);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yy HH:mm:ss");
        String formattedDate = dateFormat.format(dt);
        System.out.println(formattedDate);
    }
}
