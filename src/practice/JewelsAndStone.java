package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStone {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int totalCountOfJewelsInStones=0;
        Set<Character> jewelSet = new HashSet<>();
        for(Character j: jewels.toCharArray()){
            jewelSet.add(j);
        }
        for(Character s : stones.toCharArray()){
            if(jewelSet.contains(s)){
                totalCountOfJewelsInStones++;
            }
        }
       return totalCountOfJewelsInStones;
    }


}
