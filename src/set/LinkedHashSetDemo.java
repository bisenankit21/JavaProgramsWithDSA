package set;

import java.util.LinkedHashSet;
import java.util.SequencedMap;
import java.util.SequencedSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        var visitedcCountries = new LinkedHashSet<String>();
        visitedcCountries.add("India");
        visitedcCountries.add("USA");
        visitedcCountries.add("Sri Lanka");
        visitedcCountries.add("Nepal");
        visitedcCountries.add("Pakistan");
        for (String country : visitedcCountries) {
            System.out.println(country);
        }
        SequencedSet<String> reversedSet = new LinkedHashSet<>(visitedcCountries.reversed());
        System.out.println(reversedSet);
    }
}
