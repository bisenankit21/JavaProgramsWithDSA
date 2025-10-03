package JavaSQLDate;

import java.sql.Date;

public class JavaSQLDate {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());

        java.util.Date cuurentDate = new java.util.Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(cuurentDate);
    }
}
