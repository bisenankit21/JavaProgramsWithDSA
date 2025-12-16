package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindThirdLargestElementFromArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 12, 44, 32, 52, 81, 59, 84, 72, 37);

        int[] arr = {1, 12, 44, 32, 52, 81, 59, 84, 72, 37};
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
    }
}
