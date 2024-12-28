package String;

public class ConcatMethodDemo {
    public static void main(String[] args) {
        String s1 = "Hello"; // String literal
        s1  = s1 + " "+"World"; // String literal
        System.out.println(s1);    // Hello World

        String s2 = "Hello"; // String literal
        s2  = s2.concat(" ").concat("World"); // String literal
        System.out.println(s2);    // Hello World

        String emptyString = ""; // String literal  //have some representation in heap
        String nullString = null; // String literal  // nothing is stored in heap  // does not have any value.
        System.out.println(nullString);    //will print null
        System.out.println(emptyString);  // will print empty string  as a blank value

    }
}
