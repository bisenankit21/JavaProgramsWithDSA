package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
      /*  Set<Integer> commonSet = new HashSet<>();
        for(int a: nums1){
            for(int b: nums2){
                if(a==b){
                    commonSet.add(a);
                }
            }
        }
        int[] intArray = commonSet.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }*/
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int a : nums1) {
            set.add(a);
        }
        for (int b : nums2) {
            if (set.contains(b)) {
                resultSet.add(b);
            }
        }
        int[] arr = new int[resultSet.size()];
        int index = 0;
        for (int a : resultSet) {
            arr[index] = a;
            index++;
        }
        return arr;
    }
}
