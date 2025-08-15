package objectDemo;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = new String("Ankit");
        String s2 =  new String("Ankit");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    }
}
