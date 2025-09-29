package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseDemo
{
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("HR");
        departmentList.add("Admin");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        Stream<String> departmentStream = departmentList.stream();
        departmentStream.forEach(System.out::println);
        departmentStream.forEach(System.out::println);
    }
}
