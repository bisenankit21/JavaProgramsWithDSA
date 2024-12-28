package String;

public class EscapeSeqDemo {
    public static void main(String[] args) {
        String name = "\"Ankit\"";    // here \" is escape sequence
        System.out.println(name);    //print "Ankit"

        String m = "\u004D";
        System.out.println(m);    //print M
     }
}
