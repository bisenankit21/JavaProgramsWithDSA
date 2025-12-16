package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FGindMaxElementFromStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 3, 7);
        Integer s= numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(s);

        Integer s1 = numbers.stream().reduce((a,b)-> a>b?a:b).get();
        System.out.println(s1);

        Integer s3 = numbers.stream().max(Integer::compare).get();
        System.out.println(s3);

    }
}
