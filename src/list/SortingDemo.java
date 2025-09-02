package list;

import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // adding elements to the ArrayList
        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Sri Lanka");
        countries.add("Nepal");
        countries.add("Pakistan");
        countries.add("India");
        System.out.println(countries);
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);


        var countries1 = new ArrayList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");
        countries1.add("Canada");
      //  countries1.sort(new LastCharComparator());//sort by last Char comparator
        Collections.sort(countries1, new LastCharComparator());
        System.out.println(countries1);
    }
}
