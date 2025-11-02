package practice;

public class DetectCapital {
    public static void main(String[] args) {
      boolean result  = detectCapitalUse("USA");
      boolean result1 = detectCapitalUse("FlaG");
      boolean result2 = detectCapitalUse("leetcode");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static boolean detectCapitalUse(String word) {
        int charCount = 0;
        for(int i =0; i< word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                charCount++;
            }
        }
        if(charCount==0){
            return true;
        }
        if(charCount==word.length()){
            return true;
        }
        else{
            return false;
        }

        /*String capString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallString = "abcdefghijklmnopqrstuvwxyz";
        int count =1;
        if(capString.contains(String.valueOf(word.charAt(0)))){
            for(int i=1;i<word.length();i++){
                if(capString.contains(String.valueOf(word.charAt(i)))){
                    count++;
                }
            }
        }
        if(smallString.contains(String.valueOf(word.charAt(0)))){
            for(int i=1;i<word.length();i++){
                if(smallString.contains(String.valueOf(word.charAt(i))))
                {
                    count++;
                }
            }
        }

        if(capString.contains(String.valueOf(word.charAt(0))) && smallString.contains(String.valueOf(word.charAt(1)))  ){
            for(int i=1;i<word.length();i++){
                if(smallString.contains(String.valueOf(word.charAt(i))))
                {
                    count++;
                }
            }
        }
        return count == word.length();*/
    }
}
