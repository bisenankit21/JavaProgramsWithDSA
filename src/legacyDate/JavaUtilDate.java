package legacyDate;

import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date currentDate =new Date();
        currentDate.setTime(200);
        System.out.println(currentDate);
        long timeInms = currentDate.getTime();
        System.out.println(timeInms);

        Date futureDate = new Date(2025, 8, 30);
        System.out.println(futureDate);
        long timeInms1 = futureDate.getTime();
        System.out.println(timeInms1);

        Date date = new Date(timeInms1+86400000);
        System.out.println(date);

        boolean isAfter = futureDate.after(date);
        System.out.println(isAfter);
    }
}
