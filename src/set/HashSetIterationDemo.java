package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {
    public static void main(String[] args) {
        Set<String> supePowers = new HashSet<>();
        supePowers.add("Invisibility");
        supePowers.add("Super Strength");
        supePowers.add("Flight");
        supePowers.add("Super Speed");
        supePowers.add("Time Travel");
        supePowers.add("Telekinesis");
        supePowers.add("Midas Touch");
        for(String power: supePowers){
            System.out.println(power.toUpperCase());
        }

        Iterator<String> iterator = supePowers.iterator();
        while (iterator.hasNext()){
            String power = iterator.next();
            System.out.println(power.toLowerCase());
        }
    }
}
