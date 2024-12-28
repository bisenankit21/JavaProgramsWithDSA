package String;

public class LengthMethodDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String combined= s1 + " " + s2;
        int length = s1.length();
        int length1 = s2.length();
        int length2 = combined.length();
        System.out.println(length);
        System.out.println(length1);
        System.out.println(length2);

        int emptyStringLength = "".length();
        System.out.println(emptyStringLength);
        int length4 = "Hello".length();
        System.out.println(length4);
    }
}
