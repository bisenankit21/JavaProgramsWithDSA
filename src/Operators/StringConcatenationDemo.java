package Operators;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        String output = 4+2 + "Goals";
        int  num1 = 4;
        int num2 = 2;
        String s1 = "Goals";
        String output1 = num1 + num2 + s1;


        output1 = num1 + (num2 + s1);
        output1 = ""+ num1 + num2 + s1;

        boolean b =false;
        output1 = b +(num2+num1+s1);

        String s2= null;
        String s3 = 6 + s2;
        String s4 = "goals"+s2;


    }
}
