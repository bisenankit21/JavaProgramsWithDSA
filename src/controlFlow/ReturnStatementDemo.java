package controlFlow;

public class ReturnStatementDemo {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println(result);
        int index = findAndReturnNumber(new int[]{1,2,3,4}, 3);
        System.out.println(index);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int findAndReturnNumber(int[] arrayOgNums, int targetNum) {
        for (int i = 0; i < arrayOgNums.length; i++) {
            if (arrayOgNums[i] == targetNum) {
                return i;
            }
        }
        return -1;
    }
}