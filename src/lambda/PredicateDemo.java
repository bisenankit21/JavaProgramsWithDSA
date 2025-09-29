package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num->num%2==0;
        System.out.println(isEven.test(16));
        System.out.println(isEven.test(15));

        Predicate<Integer> isGreterThan10 = num->num>10;
        System.out.println(isGreterThan10.test(16));
        System.out.println(isGreterThan10.test(5));

        //To check if the number is even and greater than 10
        System.out.println(isEven.and(isGreterThan10).test(16));

        //To check if the number is even or greater than 10
        System.out.println(isEven.or(isGreterThan10).test(13));

        System.out.println(isEven.negate().test(13));

        Predicate<Integer> isOdd= Predicate.not(isEven);
        System.out.println(isOdd.test(4));

       Predicate<String> checkEquality = Predicate.isEqual("Ankit");
        System.out.println(checkEquality.test("Bisen"));  //False

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
