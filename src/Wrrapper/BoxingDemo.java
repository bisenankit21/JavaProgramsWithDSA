package Wrrapper;

public class BoxingDemo {
    public static void main(String[] args) {
        int num = 16;
        //approach 1 - with the help of constructor
        Integer i1 = new Integer(num);   //deprecated
        Double double1 = new Double(3.14); //deprecated-- not recommended
        Long long1 = new Long("123456"); //deprecated-- not recommended

        //approach 2 - with the help of valueOf method
        Integer integer2= Integer.valueOf(num); // recommended
        Double double2 = Double.valueOf("3.14"); // recommended
        Long long2 = Long.valueOf("123456"); // recommended

        //with parsing
        int num1 = Integer.parseInt("18");  //parsing
        System.out.println(num1);  //18

    }
}
