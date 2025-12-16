package practice;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInAString {
    public static void main(String[] args) {
        String str = "Here is my place Navegoen";
        String[] words = str.split(" ");
        Arrays.stream(words).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).ifPresent(System.out::println);
        String s = Arrays.stream(words).max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);
    }
}
