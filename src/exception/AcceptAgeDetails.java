package exception;

import exception.custom.InvalidAgeException;

import java.util.Scanner;

public class AcceptAgeDetails {

    public static void main(String[] args) throws InvalidAgeException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if(age < 0  || age > 100){
            throw new InvalidAgeException("Age should be between 0 to 100");
        }
        System.out.println("Your Age is " + age);
    }
}
