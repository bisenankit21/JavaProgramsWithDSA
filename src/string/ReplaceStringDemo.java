package string;

public class ReplaceStringDemo {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = s1.replace("Hello", "Hi");
        System.out.println(s2);

        String s3 = "Hello World";
        String s4 = s3.replace("o", "*");

        String s5 = "Hello World Hello hello";
        String s6 = s5.replaceFirst("Hello", "Hi");

        String s7 = "ababababab";
        String s8 = s7.replace("ab", "*");

        String originalString = "Java is fun";
        String replacedString = originalString.replaceAll("a|e|i|o|u", "*");

    }
}
