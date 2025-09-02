package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Sri Lanka");
        countries.add("Nepal");
        countries.add("Pakistan");
        countries.add("India");
        Iterator<String> iterator = countries.iterator(); //Iterator is an interface// >
        while(iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);
            if(country.equals("India")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}
