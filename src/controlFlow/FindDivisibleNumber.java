package controlFlow;

public class FindDivisibleNumber {
    public static void main(String[] args) {
        int lcm = findCommonMultiple(5,6);
        System.out.println(lcm);
    }

    private static int findCommonMultiple(int num1, int num2) {
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                break;
            }
            max++;
        }
        return max;
    }
}
