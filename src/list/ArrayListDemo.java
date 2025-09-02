package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<String> countryNames = new ArrayList<String>(); // we can not create the object of List as List is the interface, we can  create the object of its implementation class.
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();
        System.out.println(countryNames.size());
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Sri Lanka");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.add(1, "Nepal"); //it will insert this element not replace
        System.out.println(countryNames);
        countryNames.set(1, "Pakistan");
        System.out.println(countryNames);
        countryNames.remove("India");  //first occurrence will remove from List.
        System.out.println(countryNames);
        String firstCountry = countryNames.getFirst();
        String lastCountry = countryNames.getLast();
        System.out.println("firstCountry = " + firstCountry);
        System.out.println("lastCountry = " + lastCountry);
        List<String> reversedCountryNames = countryNames.reversed();
        System.out.println(reversedCountryNames);
        countryNames.clear();
        System.out.println(countryNames);

    }
}
