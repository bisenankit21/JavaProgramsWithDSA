package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWithBFR {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Temp\\File.txt");
        BufferedReader reader  = new BufferedReader(fr);
        String line;
        while ( (line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
