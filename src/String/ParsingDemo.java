package String;

public class ParsingDemo {
    public static void main(String[] args) {
        String strInt = "456";
        int num = Integer.parseInt(strInt);

        String strDouble1 = "3.14";
        double num1 = Double.parseDouble(strDouble1);

        String floatString = "3.14f";
        float num2 = Float.parseFloat(floatString);

        String strLong = "123456768";
        long num5 = Long.parseLong(strLong);

        String strBoolean = "true";
        boolean result = Boolean.parseBoolean(strBoolean);

        String hello = "Hello";
        char ch = hello.charAt(0);
        char[] charArray = hello.toCharArray();
        char ch1 = charArray[0];

        int num3 = 10;
        String str = String.valueOf(num3);

        float num4 = 3.14f;
        String strFloat = String.valueOf(num4);
    }
}
