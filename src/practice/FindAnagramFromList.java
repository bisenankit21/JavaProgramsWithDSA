package practice;

import java.util.*;

public class FindAnagramFromList {
    public static void main(String[] args) {
        List<String> words = List.of("listen", "silent", "enlist", "google", "gooegl", "rat", "tar", "art", "evil", "vile", "live", "veil");
        String[] arrayOfWords = words.toArray(new String[0]);
        List<String> anagramWord = new ArrayList<>();
        for (String eachWord : arrayOfWords){
            char[] charWord  = eachWord.toCharArray();
            Arrays.sort(charWord);
            String s = new String(charWord);
            anagramWord.add(s);
        }

        Map<String, Integer> ana = new HashMap();

        for(String w : anagramWord){
            ana.put(w, ana.getOrDefault(w,0)+1);
        }
        for(Map.Entry<String, Integer> a : ana.entrySet()){
            if(a.getValue()>1){
                System.out.println("Anagram word is "+a.getKey());
            }
        }
    }
}
