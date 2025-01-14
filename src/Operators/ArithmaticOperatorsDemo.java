package Operators;

public class ArithmaticOperatorsDemo {

    public static void main(String[] args) {
        byte num1;
        byte num2 = 5;
        byte num3 = 2;

        //if operands are other then lon
       // num1 = num2  + num3;    // here byte datatype is converted to int datatype; result will be in Int
        num1 = (byte) (num2 + num3);

        num1 = 5+3;   //for constant values java compiler will allow this.

        double num4;
        double num5 = 4.12;
        double num6 = 3;
        num4 =num5 + num6;
        System.out.println(num4);


    }
}
