package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Sri Lanka");
        countries.add("Nepal");
        countries.add("Pakistan");
        countries.add("India");
        //to convert it into Array
        String[] arrayCountries = countries.toArray(new String[countries.size()]);
        System.out.println(Arrays.toString(arrayCountries));

        //to convert it into Arraylist
        List<String> arraylistCountries = Arrays.asList(arrayCountries);
        System.out.println(arraylistCountries);
    }
}
