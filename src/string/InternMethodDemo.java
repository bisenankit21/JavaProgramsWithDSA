package string;

public class InternMethodDemo {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = new String("Hello World!").intern();
        System.out.println(s1 == s2); //print true

        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println(s3 == s4); //print false

        String s5 = s4.intern();
        System.out.println(s5 == s3); //print true
    }
}
