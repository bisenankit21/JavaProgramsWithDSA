import java.util.Arrays;

public class Solution {

        public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";
            char[] sArray = s.toCharArray();
            System.out.println(Arrays.toString(sArray));
            Arrays.sort(sArray);
            System.out.println(sArray);
            String sSort = new String(sArray);
            System.out.println(sSort);

            char[] tArray = t.toCharArray();
            Arrays.sort(tArray);
            String tSort = new String(tArray);

            if(sSort.equals(tSort)){
                System.out.println(true);
            }
            System.out.println(false);

        }

}



