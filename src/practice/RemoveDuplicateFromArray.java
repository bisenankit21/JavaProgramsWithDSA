package practice;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4};
        /*int[] result= Arrays.stream(arr).distinct().toArray();
        for(int a : result){
            System.out.println(a);
        }*/

        /*Set<Integer> result = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        for(int a: arr){
            if(!result.add(a)){
                resultList.add(a);
            }
        }
        resultList.stream().forEach(System.out::println);*/

        Map<Integer, Integer> mapResult = new HashMap<>();
        List<Integer> resultList1  = new ArrayList<>();
        for(int b: arr){
            mapResult.put(b, mapResult.getOrDefault(b, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entries : mapResult.entrySet()){
            if(entries.getValue()>1){
                resultList1.add(entries.getKey());
            }
        }
        resultList1.stream().forEach(System.out::println);
    }
}
