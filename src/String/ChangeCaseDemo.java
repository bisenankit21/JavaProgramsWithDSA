package String;

public class ChangeCaseDemo {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        String s3 = s1.toUpperCase();
        System.out.println(s3);
        String specialString = "Hello@World$";
        String s4 = specialString.toLowerCase();
        String s5 = specialString.toUpperCase();
        System.out.println(s4);
    }
}
