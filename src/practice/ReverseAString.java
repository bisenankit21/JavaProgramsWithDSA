package practice;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Ankit";
        String result= "";
        for(int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
        }
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
