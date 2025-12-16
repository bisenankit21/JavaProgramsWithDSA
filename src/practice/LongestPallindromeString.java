package practice;

import java.util.Comparator;
import java.util.List;

public class LongestPallindromeString {
    public static void main(String[] args) {
        List<String> list = List.of("level", "hello", "radar", "world", "madam", "java", "Malayalam");

        String result = list.stream().filter(s->isPalindrome(s)).max(Comparator.comparingInt(String::length)).get();
        System.out.println(result);
    }

    private static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverseString = stringBuilder.reverse().toString();
        if(str.equals(reverseString)){
            return true;
        }
        return false;
    }
}
