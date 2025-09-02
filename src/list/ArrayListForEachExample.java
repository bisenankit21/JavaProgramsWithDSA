package list;

import java.util.ArrayList;

public class ArrayListForEachExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Sri Lanka");
        countries.add("Nepal");
        countries.add("Pakistan");
        countries.add("India");
        for (String country : countries) {
            System.out.println(country);
        }
    }

}
