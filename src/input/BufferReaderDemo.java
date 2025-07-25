package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =  new InputStreamReader(System.in);  //here System.in is going to create the object of input Stream
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a value: ");
        String num =  bf.readLine();
        System.out.println("User entered: " + num);
    }
}
