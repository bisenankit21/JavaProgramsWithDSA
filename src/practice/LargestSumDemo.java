package practice;

public class LargestSumDemo {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[i] + nums[j];
            }
            if (maxSum < sum) {
                maxSum = sum;
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
