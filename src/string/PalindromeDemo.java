package string;

public class PalindromeDemo {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer stringBuffer = new StringBuffer();
        String s2 = stringBuffer.append(s1).reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }
    }
}
