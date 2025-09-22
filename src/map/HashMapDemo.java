package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA", "Washington DC");
        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Sri Lanka", "Colombo");
        countryMap.put(null,null);     //null key and null value,
        System.out.println(countryMap.get("India"));
        System.out.println(countryMap);
        countryMap.remove(null);
        System.out.println(countryMap.size());
    }
}
