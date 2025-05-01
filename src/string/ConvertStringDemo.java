package string;

public class ConvertStringDemo {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue =3.14;
        boolean booleanValue = true;

        String strIntValue = String.valueOf(intValue);
        String strDoubleValue = String.valueOf(doubleValue);
        String strBooleanValue = String.valueOf(booleanValue);
        System.out.println(strIntValue);
        System.out.println(strDoubleValue);
        System.out.println(strBooleanValue);

        int age =30;
        String message = "I am " + age + " years old";
        System.out.println(message);

        String piValue = "" + 3.14;
        System.out.println(piValue);
    }
}
