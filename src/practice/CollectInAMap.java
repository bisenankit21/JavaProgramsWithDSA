package practice;

import java.util.List;
import java.util.stream.Collectors;

public class CollectInAMap {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "python", "c++", "c#");
        list.stream().collect(Collectors.toMap(word->word, word->word.length())).entrySet().stream().forEach(System.out::println);
    }
}
