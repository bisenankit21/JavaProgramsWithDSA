package String;

public class StringSearchDemo {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int indexOf = originalString.indexOf("World");
        int indexOf1 = originalString.indexOf('!');
        System.out.println(indexOf);
        System.out.println(indexOf1);

        int indexOf2 = originalString.lastIndexOf("@"); //will return -1

        boolean result = originalString.contains("World");
        boolean result1 = originalString.contains("@");
        System.out.println(result);
        System.out.println(result1);

        boolean startsWith = originalString.startsWith("Hello");
        boolean endsWith = originalString.endsWith("!");
        System.out.println(startsWith);
        System.out.println(endsWith);

        boolean isMatched = originalString.matches(".*World.*");

    }
}
