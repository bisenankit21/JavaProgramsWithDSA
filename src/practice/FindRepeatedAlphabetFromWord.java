package practice;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedAlphabetFromWord {
    public static void main(String[] args) {
        String word = "Google".toLowerCase();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(char alpha: word.toCharArray()){
            characterIntegerMap.put(alpha, characterIntegerMap.getOrDefault(alpha, 0)+1);
        }
        for(char c : characterIntegerMap.keySet()){
            if(characterIntegerMap.get(c)>1){
                System.out.println("Repeated character are " + c);
            }
        }
        System.out.println(characterIntegerMap);
    }
}
