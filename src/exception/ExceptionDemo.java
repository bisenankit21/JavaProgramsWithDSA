package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner =null;
        try{
             scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);

        }
        catch(InputMismatchException ex){
           // ex.printStackTrace();
          //  System.out.println(ex.getStackTrace());
            System.out.println("Please provide input in numerical format only");
        }
        finally {
            System.out.println("Finally block");
            if(scanner != null){
                scanner.close();
            }

        }

    }
}
