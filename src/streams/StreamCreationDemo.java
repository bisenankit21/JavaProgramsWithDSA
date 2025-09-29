package streams;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("HR");
        departmentList.add("Admin");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        Stream<String> departmentStream = departmentList.stream();
        //departmentStream.parallel();  --we can create simple stream into parallel stream
      //  departmentStream.forEach(department->System.out.println(department));
        departmentStream.forEach(System.out::println);

       Stream<String>  inStream= Stream.of("Ankit", "Bisen", "Kumar");
       inStream.forEach(System.out::println);

       Stream<String> parallelStream = departmentList.parallelStream();
       parallelStream.forEach(System.out::println);


       String[] arraysOfWords = {"Ankit","Bisen","Hey"};
       Stream<String> streamOfWords = Arrays.stream(arraysOfWords);

       Stream<String> emptyStream = Stream.empty();

     // Stream.generate(new Random()::nextInt).forEach(System.out::println);
      // Stream.iterate(1,  n->n+1).forEach(System.out::println);
    }
}
