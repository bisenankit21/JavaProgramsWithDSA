package exception;

import exception.custom.DivideByZeroException;

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a denominator value: ");
        int num2 = sc.nextInt();
        if(num2 == 0) {
            throw new DivideByZeroException("Denominator cannot be zero");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
