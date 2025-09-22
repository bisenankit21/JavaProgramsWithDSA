package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new TreeMap<>();
        numbers.put(23, "Twenty Three");
        numbers.put(45, "Fourty Five");
        numbers.put(67, "Sixty Seven");
        numbers.put(3, "Three");
        numbers.put(12, "Twelve");
        System.out.println(numbers);

        for(Map.Entry<Integer, String> entry : numbers.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
