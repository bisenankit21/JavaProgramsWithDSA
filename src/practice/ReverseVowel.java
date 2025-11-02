package practice;

public class ReverseVowel {
    public static void main(String[] args) {
        String word = "leetcode";
        System.out.println(reverseVowels(word));
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(!(chars[start]=='a' || chars[start]=='e'||chars[start]=='i'|| chars[start]=='o' || chars[start]=='u'
                    || chars[start]=='A' ||chars[start]=='E' ||chars[start]=='I' ||chars[start]=='O' || chars[start]=='U')){
                start++;
            }
            if(!(chars[end]=='a' || chars[end]=='e'||chars[end]=='i'|| chars[end]=='o' || chars[end]=='u' || chars[end]=='A'
                    ||chars[end]=='E' ||chars[end]=='I' ||chars[end]=='O' || chars[end]=='U')){
                end--;
            }
            if((chars[start]=='a' || chars[start]=='e'||chars[start]=='i'|| chars[start]=='o' || chars[start]=='u'
                    || chars[start]=='A' ||chars[start]=='E' ||chars[start]=='I' ||chars[start]=='O' || chars[start]=='U') && (chars[end]=='a' || chars[end]=='e'||chars[end]=='i'|| chars[end]=='o' || chars[end]=='u' || chars[end]=='A'
                    ||chars[end]=='E' ||chars[end]=='I' ||chars[end]=='O' || chars[end]=='U')){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

        }
        return new String(chars);
    }
}
