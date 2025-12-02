package practice;

public class RemoveOccuranceOfString {
    public static void main(String[] args) {
        char c = 'a';
        String s = "Ankita";

        String result = removeOccurenceOfCharFromString(c,s);
        System.out.println(result);
    }

    private static String removeOccurenceOfCharFromString(char c, String s) {
        String r = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(char a: r.toCharArray()){
            if(a!=c){
                str.append(a);
            }
        }
        return str.toString();
    }
}
