package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOneInListUsingStream {
    public static void main(String[] args) {
        List<Integer> numList = List.of(11, 18, 20, 24, 85, 66, 13);
        List<Integer> startWithOneNumber = numberStartingWithOneInListUsingStream(numList);
        System.out.println(startWithOneNumber);
    }

    private static List<Integer> numberStartingWithOneInListUsingStream(List<Integer> numList) {
        return numList.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
    }
}
