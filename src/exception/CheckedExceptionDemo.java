package exception;

import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            BufferedReader bf = new BufferedReader(isr);
            System.out.println("Please enter a value: ");
            String num = bf.readLine();
            System.out.println("User entered: " + num);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void readFile() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("D:\\Temp\\File.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
