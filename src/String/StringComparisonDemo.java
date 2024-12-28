package String;

public class StringComparisonDemo {

    public static void main(String[] args) {
        String s1 = new String("hey");
        String s2 = new String("hey");
        String s3 = new String("hello");
        boolean result = s1.equals(s2);
        boolean result1 = s1.equals(s3);
        System.out.println(result);
        System.out.println(result1);

        boolean result2 = s1.equals("hey");
        boolean result3 = "hey".equals(s1);
        boolean result4 = "hey".equals("hello");

        String s4 = "hello";
        String s5 = "HELLO";
        boolean result6 = s4.equalsIgnoreCase(s5);  // true

       int result7 = "java".compareTo("java");
       int result8 = "java".compareTo("python");
       int result9 = "python".compareTo("java");

    }
}
