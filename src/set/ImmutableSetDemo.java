package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("a","b","c"));
        processSet(stringSet);
        stringSet = Collections.unmodifiableSet(stringSet);
        processSet(stringSet);
        Set<String> stringSet1 =Set.of("a","b","c");
        processSet(stringSet1);
    }

    public static void processSet(Set<String> set) {
        //set.add("d");
        for(String element: set){
            System.out.println(element.toUpperCase());
        }

    }

}
