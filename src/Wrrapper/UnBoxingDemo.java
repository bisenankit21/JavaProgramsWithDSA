package Wrrapper;

public class UnBoxingDemo {
    public static void main(String[] args) {
        int num = 16;
        Integer integer2= Integer.valueOf(num);
        Double double2 = Double.valueOf("3.14");
        Long long2 = Long.valueOf("123456");
        int num1 = integer2.intValue();
        double num2 = double2.doubleValue();
        long num3 = long2.longValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
