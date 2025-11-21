package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DisapearedNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();
        result = findDisappearedNumbers(nums);
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int lengthOfNums = nums.length;
        List<Integer> numsList = new ArrayList<>();
        for(int num : nums){
            numsList.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=lengthOfNums;i++){
            if(!numsList.contains(i)){
                result.add(i);
            }
        }
return result;
    }
}
