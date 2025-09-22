package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> visitedCountry = new HashSet<>();
        visitedCountry.add("India");
        visitedCountry.add("USA");
        visitedCountry.add("Sri Lanka");
        visitedCountry.add("Nepal");
        visitedCountry.add("Pakistan");
        visitedCountry.add("India");
        System.out.println(visitedCountry);
        System.out.println(visitedCountry.size());
        boolean isNepal = visitedCountry.contains("Nepal");
        System.out.println(isNepal);
        boolean isRemove = visitedCountry.remove("Pakistan");
        System.out.println(isRemove);
        System.out.println(visitedCountry);
    }
}
