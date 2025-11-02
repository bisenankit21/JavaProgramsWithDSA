package practice;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> mapST = new HashMap<>();

        for(int i= 0 ; i < s.length(); i++){
            if(mapST.containsKey(s.charAt(i))){
                if(mapST.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
                else{
                    mapST.put(s.charAt(i), t.charAt(i));
                }
            }
            mapST.put(s.charAt(i), t.charAt(i));
        }
        return true;

    }
}
