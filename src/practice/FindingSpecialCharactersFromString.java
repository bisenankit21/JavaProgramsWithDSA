package practice;

public class FindingSpecialCharactersFromString {
    public static void main(String[] args) {
        String str = "Java$Stream*2025";
        for(char c : str.toCharArray()){
            if(!Character.isLetterOrDigit(c))
            {
                System.out.println(c);
            }
        }
    }
}
