package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        List<Double> doublesNums = new LinkedList<>();
        var countryNames = new LinkedList<String>();

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Sri Lanka");
        countryNames.add("Nepal");
        countryNames.add("Pakistan");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.set(4, "Bangladesh");   //replace with the new name at index 4
        System.out.println(countryNames);
        countryNames.remove("India");  //first occurrence will remove from List.
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        System.out.println(countryNames);
        LinkedList<String> reversedCountryNames =countryNames.reversed();
        System.out.println(reversedCountryNames);
    }
}
