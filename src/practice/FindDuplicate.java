package practice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean result = findDuplicateAtIndecis(nums,k);
        System.out.println(result);
    }

    private static boolean findDuplicateAtIndecis(int[] nums, int k) {
        Map<Integer, Integer> checkDuplicate = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(checkDuplicate.containsKey(nums[i])){
                int prevIndex = checkDuplicate.get(nums[i]);
                if((i-prevIndex)<=k){
                    return true;
                }
            }
            checkDuplicate.put(nums[i], i);
        }
        return false;
    }
}
