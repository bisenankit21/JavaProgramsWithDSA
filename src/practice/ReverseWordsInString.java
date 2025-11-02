package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] wordsArray = s.split(" ");
        List<String> reverseList = new ArrayList<>();
        for(String str : wordsArray){
            String reverseStr = reverseString(str);
            reverseList.add(reverseStr);
        }
        String reverseString = String.join(" ", reverseList);
        System.out.println(reverseString);

    }
    private static String reverseString(String str){
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr =revStr+str.charAt(i);
        }
        return revStr;
    }
}
