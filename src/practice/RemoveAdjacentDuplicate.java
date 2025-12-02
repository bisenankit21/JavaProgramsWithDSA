package practice;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        String str = "abbaca";
        String unique = removeDuplicates(str);
        System.out.println(unique);
    }

    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            // If last char in sb is same as current, remove it (duplicate pair)
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
