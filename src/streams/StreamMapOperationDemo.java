package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapOperationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("HR");
        departmentList.add("Admin");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream()
                .map(word->word.toUpperCase())
                .map(word->"Hi "+word)
                .forEach(System.out::println);
    }
}
