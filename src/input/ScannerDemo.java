package input;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.next();
        System.out.println("User entered: " + name);
        System.out.println("Please enter a age: ");
        int  age = sc.nextInt(); //here nextInt() method menan take the input from the user and convert it into int variable
        System.out.println("User entered: " + age);
        sc.close();

    }
}
