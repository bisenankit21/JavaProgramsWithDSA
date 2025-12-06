package practice;

public class RotationOfEachString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean isRotationOfString = checkRotationOdString(s1, s2);
        System.out.println(isRotationOfString);
    }

    private static boolean checkRotationOdString(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        String concatenetedString = s1+s2;
        return concatenetedString.contains(s2);
    }
}
