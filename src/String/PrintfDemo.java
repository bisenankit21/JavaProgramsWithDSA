package String;

import java.sql.SQLOutput;

public class PrintfDemo {
public static void main(String[] args) {
    String result = String.format("name : %s, Age : %d", "Ankit", 25);
    //System.out.println("name : %s, Age : %d", "Ankit", 25);
    System.out.printf("name : %s, Age : %d", "Ankit", 25);
    System.out.printf("price %.2f%n", 10.99);

    System.out.print("Hellooooo");
   }

}
