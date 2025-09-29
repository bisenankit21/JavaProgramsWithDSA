package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterOprationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("HR");
        departmentList.add("Admin");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream().filter(department->department.startsWith("A")).forEach(System.out::println);
    }
}
