package String;

public class JoinStringDemo {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java"};
        String sentence = String.join(" ", words);

        String sentence1 = String.join(" ", "Hello", "World", "Java");
        System.out.println(sentence);
        System.out.println(sentence1);
    }
}
