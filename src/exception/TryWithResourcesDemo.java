package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){  //this connection wll be closed automatically at the runtime using JVM
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);

        }
        catch(InputMismatchException ex){
            // ex.printStackTrace();
            //  System.out.println(ex.getStackTrace());
            System.out.println("Please provide input in numerical format only");
        }
        }
}
