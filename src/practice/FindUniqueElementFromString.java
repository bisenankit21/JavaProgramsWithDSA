package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueElementFromString {
    public static void main(String[] args) {
        String input = "swiss";
        Integer result = findFirstUniqueCharacter(input);
        System.out.println(result);
    }

    private static Integer findFirstUniqueCharacter(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}
