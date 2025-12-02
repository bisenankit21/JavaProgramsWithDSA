package practice;

import java.util.Arrays;

/*I need to compare if two arrays are same, but the order does not matter, just compare the elements in arr1 to elements in arr2
a. arr1 = [3, 2, 5, 7]
b. arr2 = [2, 3, 5, 7] */

public class CompareTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 5, 7};
        int[] arr2 = {1, 3, 5, 7};

        boolean result = compareTwoArrayHavingDifferentOrder(arr1, arr2);
        System.out.println(result);
    }

    private static boolean compareTwoArrayHavingDifferentOrder(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
