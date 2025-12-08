package practice;

import java.util.Arrays;

public class AnagramTwoString {
    public static void main(String[] args) {
        String s1= "silent";
        String s2 = "telnsi";
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        return Arrays.equals(charS1, charS2);
    }

}
