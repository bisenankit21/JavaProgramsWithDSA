package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();   //order will be preserved
        linkedHashMap.put(23, "Twenty Three");
        linkedHashMap.put(45, "Fourty Five");
        linkedHashMap.put(67, "Sixty Seven");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(12, "Twelve");
        for (Map.Entry<Integer,String> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        SequencedMap<Integer,String> stringLinkedHashMapReversed = linkedHashMap.reversed();
        for (Map.Entry<Integer,String> entry: stringLinkedHashMapReversed.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
