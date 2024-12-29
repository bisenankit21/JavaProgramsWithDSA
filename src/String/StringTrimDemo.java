package String;

public class StringTrimDemo {
    public static void main(String[] args) {
        String java1 = " java ".trim();
        String java2 = "java   ".trim();
        String java3 = "\n\t java\n\r".trim();
        String java4 = "J ava".trim();
        String java5 = "j \n ava".trim();

        boolean isSame =  "java".equals("java ");
        boolean isSame1 =  "java".equals("java ".trim());


    }
}
