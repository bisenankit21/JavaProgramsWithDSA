package practice;

public class KadanesAlgorithmFindMaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum is: " + maxSubArraySum(arr));

    }

    private static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i=0;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);

        }
        return maxSum;

    }
}
