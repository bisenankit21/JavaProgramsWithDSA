package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedWordUsingStream {
    public static void main(String[] args) {
        String input = "programming";
        List<Character> result = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).map(Map.Entry::getKey).toList();
        System.out.println(result);
    }
}
