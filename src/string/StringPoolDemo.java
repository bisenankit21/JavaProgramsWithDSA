package string;

public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hey";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1 == s3);

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hey");
        System.out.println(s4 == s5);
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
        System.out.println(s4 == s5);
        
    }
}
