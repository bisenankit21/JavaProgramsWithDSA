package String;

public class StringImmuatbleDemo {
    public static void main(String[] args) {
        String s = "Hello";    // String literal
        s = "Hello World";
        System.out.println(s);
        final String s1 = "Hello";    // String literal
       // s1 = "Hi World";   //will give error
    }

}
