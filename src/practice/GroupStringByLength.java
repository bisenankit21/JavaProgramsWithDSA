package practice;

import java.util.List;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> stringList = List.of("hello", "world", "java", "python", "c++", "c#");
        stringList.stream().collect(Collectors.groupingBy(s->s.length())).entrySet().stream().forEach(System.out::println);

      //  stringList.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().forEach(System.out::println);
    }
}
