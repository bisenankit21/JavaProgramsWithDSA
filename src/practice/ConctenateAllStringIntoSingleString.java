package practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConctenateAllStringIntoSingleString {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "python", "c++", "c#");
        System.out.println(list.stream().collect(Collectors.joining(" ")));
       String res= list.stream().reduce((s1,s2)->s1+" " +s2).get();
        System.out.println(res);

        String longestString = String.valueOf(list.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get());
        System.out.println(longestString);

        String longestString1 = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString1);
    }
}
