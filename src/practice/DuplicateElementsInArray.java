package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,6,6};
        List<Integer> result = duplicateElementsInArray(arr);
        result.forEach(System.out::println);
    }

    private static List<Integer> duplicateElementsInArray(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer,Integer> counterMap = new HashMap<>();
        for(int a:arr){
            counterMap.put(a, counterMap.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: counterMap.entrySet()){
            if(entry.getValue()>1){
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }
}
