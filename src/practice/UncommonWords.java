package practice;

import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        Map<String,Integer> wordsCount = new HashMap<>();
        for(String word : s1.split(" ")){
            wordsCount.put(word, wordsCount.getOrDefault(word,0)+1);
        }
        for(String word : s2.split(" ")){
            wordsCount.put(word,wordsCount.getOrDefault(word,0)+1);
        }
        List<String> result = new ArrayList<>();
        for(String w : wordsCount.keySet()){
            if(wordsCount.get(w)==1){
                result.add(w);
            }
        }
        String[] res = new String[result.size()];
        result.toArray(res);
        System.out.println(res);
        /*String sentence = s1+" "+s2;
        //System.out.println(sentence);
        String[] wordsInSentence = sentence.split(" ");
        List<String> result = new ArrayList<>();
        //System.out.println(Arrays.toString(wordsInSentence));
        Map<String, Integer> wordsCount =  new HashMap<>();
        for(String s:wordsInSentence){
            wordsCount.put(s, wordsCount.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entries: wordsCount.entrySet()){
            if(entries.getValue()==1){
                result.add(entries.getKey());
            }
        }
        String[] r = result.toArray(new String[0]);
        System.out.println(Arrays.toString(r));*/
    }
}
