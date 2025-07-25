package exception;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numerator value: ");
        String num1 = scanner.next();
        System.out.println("Enter a denominator value: ");
        String num2 = scanner.next();

        Division division = new Division();
        if(num2.equals("0")){ // if denominator is 0 then throw exception
            throw new ArithmeticException("Cannot divide by zero");
        }
        double output = division.divide(num1, num2);
        System.out.println(output);
    }
}
