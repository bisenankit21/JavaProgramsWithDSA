package map;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of("a",1,"b",2,"c",3,"d",4,"e",5,"f",6,"g",7,"h",8);
         processMap(stringIntegerMap);

         Map<Integer, String> integerStringMap = Map.ofEntries(entry(1,"a"),
                 entry(2,"b"),
                 entry(3,"c"),
                 entry(4,"d"),
                 entry(5,"e"),
                 entry(6,"f"),
                 entry(7,"g"),
                 entry(8,"h"));
         processMap1(integerStringMap);
    }
    public static void processMap(Map<String, Integer> stringIntegerMap){
      //  stringIntegerMap.put("d",4);   -> UnsupportedOperationException as the map is immutable
    for(Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }

    public static void processMap1(Map<Integer, String> integerStringMap){
        //  stringIntegerMap.put("d",4);   -> UnsupportedOperationException as the map is immutable
        for(Map.Entry<Integer, String> entry : integerStringMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
