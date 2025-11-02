package practice;

public class ReverseWordsInStringOtherWay {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }

        System.out.println(result.toString().trim());

    }
}
