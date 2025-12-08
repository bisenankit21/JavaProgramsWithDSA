package practice;

import java.util.List;

public class SumOfAllElemenetsInAListOfIntegers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1,2,3,4,4);
        int sum = listOfIntegers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
