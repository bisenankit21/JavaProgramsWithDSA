package practice;

import java.util.List;

public class CalculateAverageOfInteger {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 4, 3, 6, 7, 5, 6, 8, 4, 3, 9, 7);
        numList.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
}
