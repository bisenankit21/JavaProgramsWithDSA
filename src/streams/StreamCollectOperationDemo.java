package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectOperationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("HR");
        departmentList.add("Admin");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        List<String> stringList=departmentList.stream().filter(word->word.startsWith("S"))
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
