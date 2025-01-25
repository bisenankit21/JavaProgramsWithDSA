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

        int result = 9/2;
        float result1 = 9/2f;

        int result2 = 9%2;

        byte num7 = 10;
        byte num8 = 5;
        byte result3 = (byte) (num7 + num8);   // num7 and num8 will convert into int data type before operation.

        byte num9 = 10;
        byte num10 = 5;
        byte result4 = (byte) (num9 - num10);   // num9 and num10 will convert into int data type before operation.

        byte num11 = -(-10);

        int num12 = 10;
        num12+=2.2;

        int num13 = 10;
        int num14 = 2;
        num14 = num13++ +5;

        int num15 = 9;
        num15 = num15++;



    }
}
