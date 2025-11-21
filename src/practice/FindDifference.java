package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String s, String t) {
       /* char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        char z = 'a';
        Set<Character> sSet = new HashSet<>();
        for(char x : sArray){
            sSet.add(x);
        }

        for(char y : tArray){
            if(!sSet.contains(y)){
                z=y;
            }
        }
        return z;
    }*/

       /* HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        char ch = 'a';
        for (char c : t.toCharArray()) {
            if (sMap.get(c) != tMap.get(c)) {
                ch = c;
                return ch;
            }
        }
        return ch;*/
        int xor = 0;
        for (char c : s.toCharArray()) {
            xor ^= c;
        }
        for (char c : t.toCharArray()) {
            xor ^= c;
        }
        return (char) xor;

    }
}
