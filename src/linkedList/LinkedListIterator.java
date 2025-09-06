package linkedList;

import java.sql.Struct;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String args[]) {
        var countryNames = new LinkedList<String>();

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("Sri Lanka");
        countryNames.add("Nepal");
        countryNames.add("Pakistan");
        countryNames.add("India");
        //method 1 of iteration
        for(String country : countryNames) {
            System.out.println(country.toUpperCase());
        }
        //method 2 using iterator
        Iterator<String> iterator =  countryNames.iterator();
        while(iterator.hasNext()){
            String country = iterator.next();
            System.out.println(country.toLowerCase());
        }

        //method 3 using iterator
        ListIterator<String> listIterator =  countryNames.listIterator();
        while(listIterator.hasNext()){
            String country = listIterator.next();
            System.out.println(country.toLowerCase());
        }

        while(listIterator.hasNext()){
            String country = listIterator.previous();
            System.out.println(country.toLowerCase());
        }

    }
}
