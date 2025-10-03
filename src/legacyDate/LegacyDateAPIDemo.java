package legacyDate;

import java.util.Date;

public class LegacyDateAPIDemo {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(2025, 8, 30);
        System.out.println(date1); //Wed Sep 30 00:00:00 IST 3925
        System.out.println(date);   //Tue Sep 30 23:50:11 IST 2025
    }
}
