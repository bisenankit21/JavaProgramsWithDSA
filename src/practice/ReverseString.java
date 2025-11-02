package practice;

public class ReverseString {
    public static void main(String[] args) {
        String revString = reverseString("abcdefg", 2);
        String revString1 =  reverseString("abcd", 2);
        System.out.println(revString);
        System.out.println(revString1);
    }

    private static String reverseString(String s, int k) {
        char[] charsString  = s.toCharArray();
       // System.out.println(charsString);
        int i=0;
        int j = k-1;
        while(i<j){
            char temp = charsString[i];
            charsString[i] = charsString[j];
            charsString[j] = temp;
            i++;
            j--;
        }
        return new String(charsString);
    }
}
