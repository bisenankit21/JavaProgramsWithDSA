package practice;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        int result = findMissingNumber(nums);
        System.out.println(result);
    }

    private static int findMissingNumber(int[] nums) {
        int numsLength = nums.length+1;
        int totalSum = numsLength*(numsLength+1)/2;
        int sum=0;
        for(int i: nums){
            sum=sum+i;
        }
        return totalSum-sum;
    }
}
