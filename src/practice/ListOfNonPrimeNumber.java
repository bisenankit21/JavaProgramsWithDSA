package practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfNonPrimeNumber {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for(int i =1000; i<1500;i++) {
            if (!isPrime(i)) {
                numList.add(i);
            }
        }
        System.out.println(numList);
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
