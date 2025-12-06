package practice;

import java.util.List;

public class SumOfEvenAndOddFromList {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 4, 3, 6, 7, 5, 6, 8, 4);
        int sumOfEven = sumOfEvenFromList(numList);
        int sumOfOdd = sumOfOddFromList(numList);
        System.out.println("Sum of Even Number : " + sumOfEven);
        System.out.println("Sum of Odd Number : " + sumOfOdd);
    }

    private static int sumOfOddFromList(List<Integer> numList) {
        int sumOfOdd = numList.stream().filter(n->n%2!=0).reduce(Integer::sum).get();
        return sumOfOdd;

    }

    private static int sumOfEvenFromList(List<Integer> numList) {
        int sumOfEven = numList.stream().filter(n->n%2==0).reduce(Integer::sum).get();
        return sumOfEven;

    }
}
