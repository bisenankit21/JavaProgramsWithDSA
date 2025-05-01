package string;

public class EmptyCheckDemo {
    public static void main(String[] args) {
        String s1 = "";
        boolean result = s1.isEmpty();
        boolean isLengthZero = s1.length() == 0;
        boolean isEqualEmpty = "".equals(s1);

        String nullString = null;
        boolean result1 = "".equals(nullString); // return false
       // boolean result2 = nullString.isEmpty();  // will throw exception
       // boolean result3 = nullString.length() == 0; // will throw exception

        String blankString = "  ";
        boolean result4 = blankString.isBlank();
        boolean result5 = blankString.isEmpty();

    }
}
