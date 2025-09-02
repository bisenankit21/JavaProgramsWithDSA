package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Sri Lanka");
        countries.add("Nepal");
        countries.add("Pakistan");
        countries.add("India");
        ListIterator<String> iterator = countries.listIterator(); //Iterator is an interface// >
        //Iterate in forward direction
        while(iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);
        }
        //Iterate in reverse direction
        while(iterator.hasPrevious()) {
            String country = iterator.previous();
            System.out.println(country);
        }

    }
}
