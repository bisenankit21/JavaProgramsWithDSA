package string;

public class StringImmuatbleDemo {
    public static void main(String[] args) {
        String s = "Hello";    // string literal
        s = "Hello World";
        System.out.println(s);
        final String s1 = "Hello";    // string literal
       // s1 = "Hi World";   //will give error
    }

}
