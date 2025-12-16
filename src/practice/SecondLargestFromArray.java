package practice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        System.out.println(
                Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        Integer i1=128;
        Integer i2 =128;
        System.out.println(i1==i2);

        int x = 10;
        x = x++ + ++x;
        System.out.println(x);
    }
}
