package string;

public class ConcatMethodDemo {
    public static void main(String[] args) {
        String s1 = "Hello"; // string literal
        s1  = s1 + " "+"World"; // string literal
        System.out.println(s1);    // Hello World

        String s2 = "Hello"; // string literal
        s2  = s2.concat(" ").concat("World"); // string literal
        System.out.println(s2);    // Hello World

        String emptyString = ""; // string literal  //have some representation in heap
        String nullString = null; // string literal  // nothing is stored in heap  // does not have any value.
        System.out.println(nullString);    //will print null
        System.out.println(emptyString);  // will print empty string  as a blank value

    }
}
